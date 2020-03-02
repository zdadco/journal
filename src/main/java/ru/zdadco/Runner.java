package ru.zdadco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        String filePath = "D:/notes.txt";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String str = scanner.nextLine();
                if (str.equals("\\c")){
                    break;
                }
                Files.write(Paths.get(filePath), (str + "\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println("Error!!!");
                ex.printStackTrace();
            }
        }
    }
}
