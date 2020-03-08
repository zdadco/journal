package ru.zdadco.core;

public enum Command {

    SAVE(""), EXIT("\\e"), READ_ALL("\\r"), SET_PATH("\\p");

    private String command;

    Command(String command) {
        this.command = command;
    }

    public static Command of(String value) {
        for (Command command : Command.values()) {
            if (command.getCommand().equals(value)) {
                return command;
            }
        }
        return SAVE;
    }

    public String getCommand() {
        return command;
    }

}
