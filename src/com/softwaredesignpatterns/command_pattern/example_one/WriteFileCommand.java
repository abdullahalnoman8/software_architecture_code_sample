package com.softwaredesignpatterns.command_pattern.example_one;

public class WriteFileCommand implements Command{
    FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
