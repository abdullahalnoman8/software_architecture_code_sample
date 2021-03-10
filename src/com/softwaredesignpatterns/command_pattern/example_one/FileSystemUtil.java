package com.softwaredesignpatterns.command_pattern.example_one;

public class FileSystemUtil {
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is "+ osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else{
            return new UnixFileSystemReceiver();
        }
    }
}
