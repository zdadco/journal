package ru.zdadco.core.reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String reade() {
        return scanner.nextLine();
    }
}
