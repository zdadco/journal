package ru.zdadco.core;

import ru.zdadco.core.reader.ConsoleReader;
import ru.zdadco.core.reader.Reader;
import ru.zdadco.core.writer.FileWriter;
import ru.zdadco.core.writer.Writer;

import java.io.IOException;

public class DefaultExecutor implements Executor {

    private Reader reader = new ConsoleReader();
    private Writer writer = new FileWriter("D:/notes.txt");

    public DefaultExecutor() {
    }

    @Override
    public void run() {
        while (true){
            try {
                String str = reader.reade();
                writer.write(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
