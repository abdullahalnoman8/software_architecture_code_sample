package com.softwaredesignpatterns.command_pattern.example_one;

public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Open file in windows.");
    }

    @Override
    public void writeFile() {
        System.out.println("Write file in windows");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file in windows");
    }
}
