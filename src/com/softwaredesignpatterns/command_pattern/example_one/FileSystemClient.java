package com.softwaredesignpatterns.command_pattern.example_one;

public class FileSystemClient {
    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver = FileSystemUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        FileInvoker writeFileInvoker = new FileInvoker(writeFileCommand);
        writeFileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        FileInvoker closeFileInvoker = new FileInvoker(closeFileCommand);
        closeFileCommand.execute();
    }
}
