package com.manic.springd;

import java.util.Arrays;

public class arrayk {

    // Function to return K'th smallest
    // element in a given array
    public static int kthSmallest(Integer[] arr, int K)
    {
        // Sort the given array
        Arrays.sort(arr);

        // Return K'th element in
        // the sorted array
        return arr[K - 1];
    }

    // driver's code
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 6, 3, 4, 19 };
        int K = 2;

        // Function call
        System.out.print("K'th smallest element is "
                         + kthSmallest(arr, K));
    }
}
