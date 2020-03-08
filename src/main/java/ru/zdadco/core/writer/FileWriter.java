package ru.zdadco.core.writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriter implements Writer {

    private Path path;

    public FileWriter(String path) {
        this.path = Paths.get(path);
    }

    @Override
    public void write(String str) throws IOException {
        Files.write(path, (str + "\n").getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
