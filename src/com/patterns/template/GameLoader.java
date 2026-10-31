package com.patterns.template;

public class GameLoader {

    public static void main(String[] args){
        System.out.println("========== WORLD OF WARCRAFT ==========\n");
        BaseGameLoader wowLoader = new WorlOfWarcraftLoader();
        wowLoader.load();

        System.out.println("\n========== DIABLO ==========\n");
        BaseGameLoader diabLoader = new DiabLoader();
        diabLoader.load();
    }

}
