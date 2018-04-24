package com.example.mike.rockpaperscissors.GameModels.Hand;

public class Rock extends Hand{

    public Rock(){
        super("Rock");
        getTrumps().add(new Scissors());
    }
}
