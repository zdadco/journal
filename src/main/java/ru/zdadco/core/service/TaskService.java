package ru.zdadco.core.service;

import java.io.IOException;

public interface TaskService {

    void askPathSave();
    void exit();
    void printAll() throws IOException;
    void save(String str) throws IOException;



}
