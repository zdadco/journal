package ru.zdadco.core.writer;

import java.io.IOException;
import java.nio.file.Path;

public interface Writer {
    void write(String str) throws IOException;

    void setPath(Path path);

}
