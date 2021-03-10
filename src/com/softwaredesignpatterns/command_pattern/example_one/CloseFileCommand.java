package com.softwaredesignpatterns.command_pattern.example_one;

public class CloseFileCommand implements Command{
    FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.closeFile();
    }
}
