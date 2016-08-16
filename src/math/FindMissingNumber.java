package math;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
         int [] numbers = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
       int n = 10;
        int missingCount = n - numbers.length;
        BitSet bitSet = new BitSet(n);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in  array is:  %n",
                Arrays.toString(numbers), n);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }


}
