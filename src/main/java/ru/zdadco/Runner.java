package ru.zdadco;

import ru.zdadco.core.Commands;
import ru.zdadco.core.DefaultExecutor;
import ru.zdadco.core.Executor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws IOException {
        Executor defExe = new DefaultExecutor();
        defExe.run();

//        Commands comm = Commands.V;
//        switch (comm) {
//            case V:
//                Path path = Paths.get("D:/notes.txt");
//                Files.readAllLines(path, StandardCharsets.UTF_8);
//            case C:
//                break;
//        }


//        private Commands comm;
//        public void tryCommand;
//
//          if (this.comm.getCommands() == Commands.C) {
//             break;
//        } else if (this.comm.getCommands() == Commands.V) {
//              Path path = Paths.get("D:/notes.txt");
//              List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//        } else if (this.comm.getCommands() --)
//            for (String line : lines) {
//                System.out.println(line);
//                    }
//                }

//
//        while (true) {
//            try {
//                String str = scanner.nextLine();
//                if (str.equals("\\c")) {
//                    break;
//                } else if (str.equals("\\v")) {
//                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//                    for (String line : lines) {
//                        System.out.println(line);
//                    }
//                }
//                Files.write(path, (str + "\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            } catch (IOException ex) {
//                System.out.println("Error!!!");
//                ex.printStackTrace();
//            }
//        }
    }

}
