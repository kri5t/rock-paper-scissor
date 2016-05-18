package com.rockpaperscissor;

/**
 * Created by kristian on 18/05/16.
 */
public class GameResult {
    private int player1Wins;
    private int player2Wins;
    private int numberOfMatches;

    public GameResult(int numberOfMatches){

        this.numberOfMatches = numberOfMatches;
    }

    public int getPlayer1Wins(){
        return player1Wins;
    }

    public void incrementPlayer1WinsByOne(){
        this.player1Wins += 1;
    }

    public int getPlayer2Wins(){
        return player2Wins;
    }

    public void incrementPlayer2WinsByOne(){
        this.player2Wins += 1;
    }

    public int getNumberOfMatchesLeft() {
        return numberOfMatches - player1Wins - player2Wins;
    }
}
