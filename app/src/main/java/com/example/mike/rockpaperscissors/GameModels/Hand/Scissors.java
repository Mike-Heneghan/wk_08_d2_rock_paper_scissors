package com.example.mike.rockpaperscissors.GameModels.Hand;

public class Scissors extends Hand{

    public Scissors(){
        super("Scissors");
        getTrumps().add(new Paper());
    }
}
