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
                if (str.equals(Commands.EXIT.getCommand())){
                    service.exit();
                } else if (str.equals(Commands.READ_ALL.getCommand())) {
                   service.printAll();
                } else {
                    service.save(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
