package com.example.mike.rockpaperscissors.GameModels.Hand;

import java.util.ArrayList;

public abstract class Hand {

    private String name;
    private ArrayList<Hand> trumps;

    public Hand(String name){
        this.name = name;
        this.trumps = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Hand> getTrumps() {
        return trumps;
    }

    public ArrayList<String> getTrumpsNames(){
        ArrayList<String> trumpNames = new ArrayList<>();
        for (Hand trump: trumps) {
            trumpNames.add(trump.getName());
        }
        return trumpNames;
    }
}
