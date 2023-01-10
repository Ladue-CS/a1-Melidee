
/**********************************************************************
 * Sample solution for Activity 3.6.4
 **********************************************************************/
/**
 * Generate random permutations of integers
 */

 import java.util.*;

 public class RandomPermutationInPlace {
     /**
      * Genereates one permutation of random integers. The number of
      * integers to generate is designated by length and the
      * randomized list of integers is returned.
      *
      * Initial conditions: length cannot be negative
      */
     public static ArrayList<Horse> next(ArrayList<Horse> list) {
        int length = list.size();

        for (int i = 1; i < length; i++) {
            Collections.swap(list, i % length, (int) (Math.random() * length));
            System.out.println(list);
        }
        return list;
     }
 }