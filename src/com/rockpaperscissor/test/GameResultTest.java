package com.rockpaperscissor.test;

import com.rockpaperscissor.GameResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kristian on 18/05/16.
 */
public class GameResultTest {
    @Test
    public void MatchesLeftShouldDecreaseOnWinForPlayer2(){
        GameResult gameResult = new GameResult(1);
        gameResult.incrementPlayer2WinsByOne();
        assertEquals(0, gameResult.getNumberOfMatchesLeft());
    }

    @Test
    public void MatchesLeftShouldDecreaseOnWinForPlayer1(){
        GameResult gameResult = new GameResult(1);
        gameResult.incrementPlayer1WinsByOne();
        assertEquals(0, gameResult.getNumberOfMatchesLeft());
    }

    @Test
    public void IncrementScoreShouldAddOneToScoreForPlayer2(){
        GameResult gameResult = new GameResult(1);
        gameResult.incrementPlayer2WinsByOne();
        assertEquals(1, gameResult.getPlayer2Wins());
    }

    @Test
    public void IncrementScoreShouldAddOneToScoreForPlayer1(){
        GameResult gameResult = new GameResult(1);
        gameResult.incrementPlayer1WinsByOne();
        assertEquals(1, gameResult.getPlayer1Wins());
    }

    @Test
    public void IfNoMoreMatchesIncrementShouldNotWorkForPlayer1(){
        GameResult gameResult = new GameResult(0);
        gameResult.incrementPlayer1WinsByOne();
        assertEquals(0, gameResult.getPlayer1Wins());
    }

    @Test
    public void IfNoMoreMatchesIncrementShouldNotWorkForPlayer2(){
        GameResult gameResult = new GameResult(0);
        gameResult.incrementPlayer2WinsByOne();
        assertEquals(0, gameResult.getPlayer1Wins());
    }
}
