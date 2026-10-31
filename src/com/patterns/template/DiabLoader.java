package com.patterns.template;

public class DiabLoader extends BaseGameLoader{



    @Override
    byte[] loadLocalData() {
        System.out.println("Loading Diab Local files");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Diab objects");
    }

    @Override
    void DownloadAdditionalFiles() {
        System.out.println("Downloading Diab Additional Files");
    }

    @Override
    void initializeProfiles() {
        System.out.println("initializing Diab profiles");
    }
}
