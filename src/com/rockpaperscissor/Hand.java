package com.rockpaperscissor;

public enum Hand {
    ROCK {
        @Override
        public boolean beats(Hand other) {
            return other == Hand.SCISSOR;
        }
    },
    PAPER {
        @Override
        public boolean beats(Hand other) {
            return other == Hand.ROCK;
        }
    },
    SCISSOR {
        @Override
        public boolean beats(Hand other) {
            return other == Hand.PAPER;
        }
    };

    public abstract boolean beats(Hand other);
}