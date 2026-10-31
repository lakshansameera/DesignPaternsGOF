package com.patterns.template;

public abstract class BaseGameLoader {
    public void load(){
        byte [] data = loadLocalData();
        createObjects(data);
        DownloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();

    }

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void DownloadAdditionalFiles();
    abstract void initializeProfiles();

    protected void cleanTempFiles(){
        System.out.println("Cleaning Temporary Files..........");
    }

}
