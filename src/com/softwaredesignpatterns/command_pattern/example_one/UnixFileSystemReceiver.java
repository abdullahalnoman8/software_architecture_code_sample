package com.softwaredesignpatterns.command_pattern.example_one;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Open File in Unix.");
    }

    @Override
    public void writeFile() {
        System.out.println("Write file in Unix.");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file in Unix");
    }
}
