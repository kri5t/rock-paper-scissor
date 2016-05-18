package com.rockpaperscissor.test;

import com.rockpaperscissor.Hand;
import com.rockpaperscissor.Player;
import com.rockpaperscissor.helpers.RandomGenerator;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mock;

/**
 * Created by kristian on 18/05/16.
 */
public class PlayerTest {
    @Test
    public void PlayerReturnAHandOnPlayHand(){
        Player player = new Player("Player1", mock(RandomGenerator.class));
        Hand hand = player.playHand();
        MatcherAssert.assertThat(hand, instanceOf(Hand.class));
    }
}