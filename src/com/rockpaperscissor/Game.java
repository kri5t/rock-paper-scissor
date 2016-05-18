package com.rockpaperscissor;

import static java.lang.System.out;

/**
 * Created by kristian on 17/05/16.
 */
public class Game {
    private final Player player1;
    private final Player player2;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public GameResult play(int numberOfMatches){
        return recursivePlay(new GameResult(numberOfMatches));
    }

    private GameResult recursivePlay(GameResult gameResult){
        if(gameResult.getNumberOfMatchesLeft() == 0) {
            return gameResult;
        }

        Hand player1Hand = player1.playHand();
        Hand player2Hand = player2.playHand();

        if(player1Hand.beats(player2Hand)) {
            win(player1.getName());
            gameResult.incrementPlayer1WinsByOne();
        } else if(player2Hand.beats(player1Hand)) {
            win(player2.getName());
            gameResult.incrementPlayer2WinsByOne();
        } else {
            out.println("Tie.. Playing again.");
        }

        out.println();
        return recursivePlay(gameResult);
    }

    private void win(String player){
        out.println(String.format("%s wins", player));
    }
}