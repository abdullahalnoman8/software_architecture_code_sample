package com.softwaredesignpatterns.command_pattern.example_one;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
