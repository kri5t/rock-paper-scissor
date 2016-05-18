package com.rockpaperscissor;

import com.rockpaperscissor.helpers.RandomGenerator;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", new RandomGenerator());
        Player player2 = new Player("Player2", new RandomGenerator(), Strategy.PlayOnlyRock);
        GameResult gameResult = new Game(player1, player2).play(100);
        out.println(String.format("Player1 %d wins", gameResult.getPlayer1Wins()));
        out.println(String.format("Player2 %d wins", gameResult.getPlayer2Wins()));
    }
}