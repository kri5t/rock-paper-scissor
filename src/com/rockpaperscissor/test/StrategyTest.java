package com.rockpaperscissor.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import com.rockpaperscissor.Hand;
import com.rockpaperscissor.Strategy;
import com.rockpaperscissor.helpers.RandomGenerator;
import org.junit.Test;
import org.mockito.stubbing.Answer;

/**
 * Created by kristian on 18/05/16.
 */


public class StrategyTest {
    @Test
    public void playOnlyRockStrategy_OnlyGivesRock() {
        Hand hand = Strategy.PlayOnlyRock.getHand(null);
        assertEquals(Hand.ROCK, hand);
    }

    @Test
    public void playOnlyScissorStrategy_OnlyGivesScissor() {
        Hand hand = Strategy.PlayOnlyScissor.getHand(null);
        assertEquals(Hand.SCISSOR, hand);
    }

    @Test
    public void playOnlyPaperStrategy_OnlyGivesPaper() {
        Hand hand = Strategy.PlayOnlyPaper.getHand(null);
        assertEquals(Hand.PAPER, hand);
    }

    @Test
    public void mixedHandStrategy_GivesRockOnZero() {
        RandomGenerator mock = mock(RandomGenerator.class);
        when(mock.GetRandomInteger(anyInt())).thenAnswer((Answer<Integer>) invocation -> 0);
        Hand hand = Strategy.PlayMixedHands.getHand(mock);
        assertEquals(Hand.ROCK, hand);
    }
    @Test
    public void mixedHandStrategy_GivesPaperOnOne() {
        RandomGenerator mock = mock(RandomGenerator.class);
        when(mock.GetRandomInteger(anyInt())).thenAnswer((Answer<Integer>) invocation -> 1);
        Hand hand = Strategy.PlayMixedHands.getHand(mock);
        assertEquals(Hand.PAPER, hand);
    }
    @Test
    public void mixedHandStrategy_GivesScissorOnTwo() {
        RandomGenerator mock = mock(RandomGenerator.class);
        when(mock.GetRandomInteger(anyInt())).thenAnswer((Answer<Integer>) invocation -> 2);
        Hand hand = Strategy.PlayMixedHands.getHand(mock);
        assertEquals(Hand.SCISSOR, hand);
    }
}