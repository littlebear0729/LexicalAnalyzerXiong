package org.haonan.xiong;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String src = readFile("test2.xiong");
        List<Lexeme> result = analyse(src);

        StringBuilder f = new StringBuilder();
        for (Lexeme l : result) {
            String s = "line%d: <%s> %s </%s>";
            String out = String.format(s, l.getLine(), l.getToken(), l.getValue(), l.getToken());
            f.append(out).append("\n");
            System.out.println(out);
        }

        // Output to file
        try {
            Files.write(Paths.get("output.txt"), f.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read source file
    public static String readFile(String filename) {
        String result = "";
        try {
            result = new String(Files.readAllBytes(Paths.get(filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<Lexeme> analyse(String source) {
        String[] lines = source.split("\n");
        Map<Integer, String> code = new HashMap<>();
        boolean lock = true; // To ignore multiple lines comments

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if (!line.strip().startsWith("//") && lock && !line.strip().startsWith("/*") && !line.isBlank())
                code.put(i + 1, line);
            if (line.strip().startsWith("/*"))
                lock = false;
            if (line.strip().endsWith("*/"))
                lock = true;
        }

        return new Lexical_Analyzer().analyzeCode(code);
    }
}