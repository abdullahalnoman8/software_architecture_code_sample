package com.softwaredesignpatterns.template_pattern;

import java.io.File;

public abstract class DataMiner {
    public final void mine(String path,File file){
        openFile(path);
        extractData(file);
        parseData();
        closeFile();
    }

    public void openFile(String path){

    }
    public void extractData(File file){

    }
    public void parseData(){

    }
    public void analyzeData(){

    }
    public void sendReport(){

    }
    public void closeFile(){

    }

}
