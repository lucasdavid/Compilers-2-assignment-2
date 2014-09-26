package runner;

import gerador.*;
import infrastructure.CompilationResultWriter;
import infrastructure.ErrorListeners.*;
import infrastructure.MessageBag;
import java.io.FileInputStream;
import laparser.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Runs the LaParser on a inputFile and outputs the result in an outputFile.
 *
 * This is the main class of the LaParser project. Therefore, the method
 * Runner.main(String[] args) will be called by the evaluator.
 *
 * @author Lucas
 */
public class Runner {

    /**
     * Runs the LaParser on a file that contains a LA source-code.
     *
     * @param inputFile name of the LA source-code file
     * @param outputFile name of the analysis result file
     * @throws Exception
     */
    public void start(String inputFile, String outputFile) throws Exception {

        ANTLRInputStream in        = new ANTLRInputStream(new FileInputStream(inputFile));
        ANTLRInputStream inGerador = new ANTLRInputStream(new FileInputStream(inputFile));
        MessageBag lexicalAndSintaticBag = new MessageBag();
        MessageBag semanticBag = new MessageBag();

        LaLexer lexer   = new LaLexer(in);
        LaParser parser = new LaParser(new CommonTokenStream(lexer));
        LaGeradorLexer  lexerGerador  = new LaGeradorLexer(inGerador);
        LaGeradorParser parserGerador = new LaGeradorParser(new CommonTokenStream(lexerGerador));

        parser.removeErrorListeners();
        lexer .removeErrorListeners();
        parser.removeErrorListeners();
        lexer .removeErrorListeners();

        LexicalErrorListener  lexical  = new LexicalErrorListener(lexicalAndSintaticBag);
        SyntaticErrorListener syntatic = new SyntaticErrorListener(lexicalAndSintaticBag);
        SemanticErrorListener.DefineMessageBag(semanticBag);

        parser.addErrorListener(syntatic);
        lexer .addErrorListener(lexical);

        parser.programa();
        parserGerador.programa();

        CompilationResultWriter writer = new CompilationResultWriter(outputFile);

        // put the first lexic/sintatic error in the writer's buffer
        if (lexicalAndSintaticBag.all().size() > 0) {
            writer
                .put(lexicalAndSintaticBag.first())
                .put("Fim da compilacao")
                .close();
        }
        
        // or, case there none lexic/sintatic error, put all semantic errors
        // in the writer's buffer
        else if (semanticBag.all().size() > 0) {
            for (String message : semanticBag.all()) {
                writer.put(message);
            }
            writer.put("Fim da compilacao").close();
        } else {
            writer.put(Gerador.getText());
            writer.close();
        }
    }

    /**
     * Executes Runner.start() method with the arguments given.
     *
     * @param args array that contains the names of the input and bag files
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        new Runner().start(args[0], args[1]);
    }
}
