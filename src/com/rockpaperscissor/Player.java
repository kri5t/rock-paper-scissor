package com.rockpaperscissor;

import com.rockpaperscissor.helpers.IRandomGenerator;

import static java.lang.System.out;

public class Player{
    private IRandomGenerator randomGenerator;
    private Strategy strategy;
    private String name;

    public Player(String name, IRandomGenerator randomGenerator) {
        this(name, randomGenerator, Strategy.PlayMixedHands);
    }

    public Player(String name, IRandomGenerator randomGenerator, Strategy strategy) {
        this.randomGenerator = randomGenerator;
        this.strategy = strategy;
        this.name = name;
    }

    public Hand playHand(){
        Hand hand = strategy.getHand(randomGenerator);
        out.println(name + " plays " + hand.toString());
        return hand;
    }

    public String getName(){
        return name;
    }
}
