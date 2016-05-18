package com.rockpaperscissor.helpers;

import java.util.Random;

/**
 * Created by kristian on 18/05/16.
 */
public class RandomGenerator implements IRandomGenerator {
    @Override
    public int GetRandomInteger(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }
}
