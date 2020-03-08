package ru.zdadco.core;

public enum Commands {

    EXIT("\\c"), READ_ALL("\\v");

    private String command;

    Commands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

}
