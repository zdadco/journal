package ru.zdadco.core;

import ru.zdadco.core.reader.ConsoleReader;
import ru.zdadco.core.reader.Reader;
import ru.zdadco.core.writer.FileWriter;
import ru.zdadco.core.writer.Writer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DefaultExecutor implements Executor {

    Path path = Paths.get("/home/zdadco/notes.txt");

    private Reader reader = new ConsoleReader();
    private Writer writer = new FileWriter(path);

    public DefaultExecutor() {
    }

    @Override
    public void run() {
        while (true){
            try {
                String str = reader.reade();
                if (str.equals(Commands.EXIT.getCommand()))
                    break;
                else if (str.equals(Commands.READ_ALL.getCommand())) {
                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
                    for (String line : lines) {
                        System.out.println(line);
                    }
                } else {
                    writer.write(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
