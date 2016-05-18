package com.rockpaperscissor.test;

import com.rockpaperscissor.Hand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kristian on 18/05/16.
 */
public class HandTest {
    @Test
    public void ScissorDoesNotBeatRock(){
        assertEquals(false, Hand.SCISSOR.beats(Hand.ROCK));
    }

    @Test
    public void ScissorDoesNotBeatScissor(){
        assertEquals(false, Hand.SCISSOR.beats(Hand.SCISSOR));
    }

    @Test
    public void PaperDoesNotBeatScissor(){
        assertEquals(false, Hand.PAPER.beats(Hand.SCISSOR));
    }

    @Test
    public void PaperDoesNotBeatPaper(){
        assertEquals(false, Hand.PAPER.beats(Hand.PAPER));
    }

    @Test
    public void RockDoesNotBeatPaper(){
        assertEquals(false, Hand.ROCK.beats(Hand.PAPER));
    }

    @Test
    public void RockDoesNotBeatRock(){
        assertEquals(false, Hand.ROCK.beats(Hand.ROCK));
    }

    @Test
    public void RockBeatsScissor(){
        assertEquals(true, Hand.ROCK.beats(Hand.SCISSOR));
    }

    @Test
    public void ScissorBeatsPaper(){
        assertEquals(true, Hand.SCISSOR.beats(Hand.PAPER));
    }

    @Test
    public void PaperBeatsRock(){
        assertEquals(true, Hand.PAPER.beats(Hand.ROCK));
    }
}
