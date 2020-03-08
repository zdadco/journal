package ru.zdadco.core;

import ru.zdadco.core.reader.ConsoleReader;
import ru.zdadco.core.reader.Reader;
import ru.zdadco.core.service.TaskService;
import ru.zdadco.core.service.TaskServiceImpl;

import java.io.IOException;

public class DefaultExecutor implements Executor {


    private Reader reader = new ConsoleReader();
    private TaskService service = new TaskServiceImpl();

    public DefaultExecutor() {
    }

    @Override
    public void run() {
        service.askPathSave();
        while (true){
            try {
                String str = reader.reade();
                switch (Command.of(str)){
                    case EXIT:
                        service.exit();
                        break;
                    case READ_ALL:
                        service.printAll();
                        break;
                    case SET_PATH:
                        service.askPathSave();
                        break;
                    case SAVE:
                        service.save(str);
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
