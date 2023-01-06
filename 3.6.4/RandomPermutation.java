/**********************************************************************
 * Sample solution for Activity 3.6.4
 **********************************************************************/
/**
 * Generate random permutations of integers
 */

import java.util.*;

public class RandomPermutation {
    /**
     * Genereates one permutation of random integers. The number of
     * integers to generate is designated by length and the
     * randomized list of integers is returned.
     *
     * Initial conditions: length cannot be negative
     */
    public static ArrayList<Horse> next(ArrayList<Horse> list) {
        Collections.shuffle(list);
        return list;
    }

}