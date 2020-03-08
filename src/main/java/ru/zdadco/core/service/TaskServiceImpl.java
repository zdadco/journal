package ru.zdadco.core.service;

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

public class TaskServiceImpl implements TaskService {

    private Path path = Paths.get("notes.txt");
    private Writer writer = new FileWriter(path);
    private Reader reader = new ConsoleReader();

    @Override
    public void askPathSave() {
        System.out.print("Use default path? (y/n): ");
        String str = reader.reade();
        if (str.equals("n")) {
            System.out.print("Write your path, this: ");
            str = reader.reade();
            path = Paths.get(str);
            writer.setPath(path);
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    @Override
    public void printAll() throws IOException {
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (String line : lines) {
            System.out.println(line);
        }
    }

    @Override
    public void save(String str) throws IOException {
        writer.write(str);
    }
}
