package com.rockpaperscissor.test;

import com.rockpaperscissor.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by kristian on 18/05/16.
 */
public class GameTest {
    private static Player player1;
    private static Player player2;

    @BeforeClass
    public static void SetUp() {
        player1 = mock(Player.class);
        when(player1.getName()).thenAnswer((Answer<String>) invocation -> "Player1");
        player2 = mock(Player.class);
        when(player2.getName()).thenAnswer((Answer<String>) invocation -> "Player2");
    }

    @Test
    public void GameShouldReturnOneWinForPlayerOne_WhenPlayer1PlaysPaper_Player2PlaysRock(){
        when(player1.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.PAPER);
        when(player2.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.ROCK);
        GameResult result = new Game(player1, player2).play(1);
        Assert.assertEquals(1, result.getPlayer1Wins());
        Assert.assertEquals(0, result.getPlayer2Wins());
    }

    @Test
    public void GameShouldReturnOneWinForPlayerOne_WhenPlayer1PlaysRock_Player2PlaysScissor(){
        when(player1.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.ROCK);
        when(player2.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.SCISSOR);
        GameResult result = new Game(player1, player2).play(1);
        Assert.assertEquals(1, result.getPlayer1Wins());
        Assert.assertEquals(0, result.getPlayer2Wins());
    }

    @Test
    public void GameShouldReturnOneWinForPlayerOne_WhenPlayer1PlaysScissor_Player2PlaysPaper(){
        when(player1.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.SCISSOR);
        when(player2.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.PAPER);
        GameResult result = new Game(player1, player2).play(1);
        Assert.assertEquals(1, result.getPlayer1Wins());
        Assert.assertEquals(0, result.getPlayer2Wins());
    }

    @Test
    public void GameShouldReturnOneWinForPlayer2_WhenPlayer2PlaysPaper_Player1PlaysRock(){
        when(player1.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.ROCK);
        when(player2.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.PAPER);
        GameResult result = new Game(player1, player2).play(1);
        Assert.assertEquals(0, result.getPlayer1Wins());
        Assert.assertEquals(1, result.getPlayer2Wins());
    }

    @Test
    public void GameShouldReturnOneWinForPlayer2_WhenPlayer2PlaysRock_Player1PlaysScissor(){
        when(player1.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.SCISSOR);
        when(player2.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.ROCK);
        GameResult result = new Game(player1, player2).play(1);
        Assert.assertEquals(0, result.getPlayer1Wins());
        Assert.assertEquals(1, result.getPlayer2Wins());
    }

    @Test
    public void GameShouldReturnOneWinForPlayer2_WhenPlayer2PlaysScissor_Player1PlaysPaper(){
        when(player1.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.PAPER);
        when(player2.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.SCISSOR);
        GameResult result = new Game(player1, player2).play(1);
        Assert.assertEquals(0, result.getPlayer1Wins());
        Assert.assertEquals(1, result.getPlayer2Wins());
    }

    @Test
    public void AfterMatch_NumberOfGetNumberOfMatchesLeftShouldReturn_0(){
        when(player1.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.PAPER);
        when(player2.playHand()).thenAnswer((Answer<Hand>) invocation -> Hand.SCISSOR);
        GameResult result = new Game(player1, player2).play(1);
        Assert.assertEquals(0, result.getNumberOfMatchesLeft());
    }
}
