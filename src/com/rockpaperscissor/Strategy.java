package com.rockpaperscissor;

import com.rockpaperscissor.helpers.IRandomGenerator;

public enum Strategy{
    PlayOnlyRock {
        @Override
        public Hand getHand(IRandomGenerator randomGenerator) { return Hand.ROCK; }
    },
    PlayOnlyScissor {
        @Override
        public Hand getHand(IRandomGenerator randomGenerator) {
            return Hand.SCISSOR;
        }
    },
    PlayOnlyPaper {
        @Override
        public Hand getHand(IRandomGenerator randomGenerator) {
            return Hand.PAPER;
        }
    },
    PlayMixedHands {
        @Override
        public Hand getHand(IRandomGenerator randomGenerator) {
            switch (randomGenerator.GetRandomInteger(3)){
                case 0:
                    return Hand.ROCK;
                case 1:
                    return Hand.PAPER;
                case 2:
                    return Hand.SCISSOR;
                default:
                    return null;
            }
        }
    };

    public abstract Hand getHand(IRandomGenerator randomGenerator);
}
