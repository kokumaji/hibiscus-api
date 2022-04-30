package dev.kkmji.hibiscus.base.utils;

import java.util.concurrent.ThreadLocalRandom;

public class MathUtil {

    // Prevent Multiple Instances
    private MathUtil() {}
    
    /**
     * <p>
     * Get a random number within a range
     * </p>
     *
     * @param max maximum value
     * @return a random integer within the specified range
     */
    public static int randomInt(int max) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextInt(Math.max(1, max));
    }

    /**
     * <p>
     * Get a random number within a range
     * </p>
     *
     * @param min minimum value <b>(inclusive)</b>
     * @param max maximum value <b>(inclusive)</b>
     * @return a random integer within the specified range
     * @throws IllegalArgumentException when min is greater than max
     */
    public static int randomInt(int min, int max) {
        if (min == max)
            return min;
        if (min > max)
            throw new IllegalArgumentException("Min may not be greater than max!");
        return min + randomInt(1 + max - min);
    }
}
