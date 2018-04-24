package com.example.mike.rockpaperscissors.GameModels.Hand;

import java.util.ArrayList;

public abstract class Hand {

    private HandType type;
    private ArrayList<HandType> trumps;

    public Hand(HandType type){
        this.type = type;
        this.trumps = new ArrayList<>();
    }

    public String getName() {
        return type.getName();
    }

    public ArrayList<HandType> getTrumps() {
        return trumps;
    }

    public void addTrump(HandType hand) {
        trumps.add(hand);
    }


}
