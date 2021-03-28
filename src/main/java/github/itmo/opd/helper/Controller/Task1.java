package github.itmo.opd.helper.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static github.itmo.opd.helper.HelperApplication.*;

public class Task1 {
    static Map<String, String> fileContent = new HashMap<>();

    static boolean isName(String s) {
        return s.charAt(s.length()-1) == ':';
    }

    static String findName(String s) {
        int start = s.lastIndexOf('-')+1;
        int end = s.indexOf('(');
        return s.substring(start, end).trim();
    }

    static boolean isDirectory(String s) {
        int start = s.lastIndexOf(' ')+1;
        return s.substring(start).trim().equals("(каталог)");
    }

    static int findLevel(String s) {
        int level = 0;
        for (char i: s.toCharArray()) {
            if (i == '|') ++level;
        }
        return level;
    }

    static public void process(String tree, String content) {
        CommandManager commandManager = new CommandManager();

        String[] lines = content.split("\n");
        for (int i = 0; i < lines.length; ++i) {
            int j = i+1;
            StringBuilder innerContent = new StringBuilder();
            while (j < lines.length && !isName(lines[j])) {
                innerContent.append(lines[j]).append("\\n");
                ++j;
            }

            String fileName = lines[i].substring(0, lines[i].length()-1).trim();
            fileContent.put(fileName, innerContent.toString());

            i = j-1;
        }

        String[] components = tree.split("\n");
        //Skip first line
        for (int i = 1; i < components.length; ++i) {
            int level = findLevel(components[i]);
            String name = findName(components[i]);

            if (level == findLevel(components[i - 1]) && isDirectory(components[i - 1]))
                filePath.remove(filePath.size()-1);

            if (isDirectory(components[i]))
                commandManager.mkdir(name);
            else
                commandManager.echo(fileContent.getOrDefault(name, ""), name);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/main/java/github/itmo/opd/helper/Controller/tree.txt"));
        StringBuilder tree = new StringBuilder();
        while (sc.hasNextLine()) tree.append(sc.nextLine()).append("\n");

        sc = new Scanner(new File("src/main/java/github/itmo/opd/helper/Controller/content.txt"));
        StringBuilder content = new StringBuilder();
        while (sc.hasNextLine()) content.append(sc.nextLine()).append("\n");

//        System.out.println(content);
        process(tree.toString(), content.toString());
    }
}
