package ru.zdadco;

import ru.zdadco.core.DefaultExecutor;
import ru.zdadco.core.Executor;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        Executor defExe = new DefaultExecutor();
        defExe.run();
    }

}
