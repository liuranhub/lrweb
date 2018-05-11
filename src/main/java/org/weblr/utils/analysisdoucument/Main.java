package org.weblr.utils.analysisdoucument;

import org.weblr.utils.analysisdoucument.documentloader.DocumentAnalysis;
import org.weblr.utils.analysisdoucument.documentloader.JavaDocumentAnalysis;
import org.weblr.utils.analysisdoucument.output.WordOutputConsole;
import org.weblr.utils.analysisdoucument.output.WordOutputFile;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String outputPath = "/Users/lr/file";

        List<DocumentAnalysis> documentAnalyses = new ArrayList<>();
//        documentAnalyses.add(new ManDocumentAnalysis("/Users/lr/file/sourceCode/man"));
        documentAnalyses.add(new JavaDocumentAnalysis("/Users/lr/file/sourceCode/java"));

        Analysis analysis = new Analysis(4, documentAnalyses,
                new WordOutputFile(outputPath,3), new WordOutputConsole(3));
        analysis.doing();
        analysis.outputByTop(1000);
    }
}
