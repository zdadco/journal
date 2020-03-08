package ru.zdadco;

import ru.zdadco.core.DefaultExecutor;
import ru.zdadco.core.Executor;

public class Runner {

    public static void main(String[] args) {
        Executor defExe = new DefaultExecutor();
        defExe.run();
    }

}
