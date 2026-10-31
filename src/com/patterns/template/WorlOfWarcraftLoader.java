package com.patterns.template;

public class WorlOfWarcraftLoader extends BaseGameLoader{


    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local WOW files");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating WOW objects");
    }

    @Override
    void DownloadAdditionalFiles() {
        System.out.println("Downloading WOW additional files");
    }

    @Override
    void initializeProfiles() {
        System.out.println("initializing WOW profiles");
    }
}
