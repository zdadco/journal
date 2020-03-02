package ru.zdadco;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Path path = Paths.get("D:/notes.txt");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String str = scanner.nextLine();
                if (str.equals("\\c")) {
                    break;
                } else if (str.equals("\\v")) {
                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
                    for (String line : lines) {
                        System.out.println(line);
                    }
                }
                Files.write(path, (str + "\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println("Error!!!");
                ex.printStackTrace();
            }
        }
    }
}
