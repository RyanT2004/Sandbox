package org.example.bigO;

import java.util.ArrayList;
import java.util.List;

public class BigO {

    public static void main(String[] args) {

        // *** nested loops are addition
        // *** if a loop is involved then O(n) is the minimum value we are looking for
        // *** add id ++ and is always constant?

        //O(1)
        int[] arr = new int[2000000];
        // O(n) * (O(1) + O(1) + O(1)) = O(n) aka product property
        for(int x = 0; x < arr.length - 1; x++){ // O(n)
            System.out.println(arr[x]); // O(1)
            // O(1)
            // O(1)
        }

        // O(n)
        int sum = 0;
        // O(n) * O(n) = O(n^2)
        for(int n = 0; n < arr.length - 1; n++){ // O(n)
            sum += arr[n]; // O(n)
        }

        // navigation from root to each node in tree

        // O(n^2)
        // O(n) * (O(n) + (O(n) * O(n) )
        // O(n) * (O(n) + O(n^2))
        // O(n) * (O(n^2) + O(n))
        // O(n^3)
        for(int x = 0; x<=10; x++){ // O(n)

            // O(n)

            for (int y = 0; y<=10; y++){ // O(n)

                // O(n)

            }
        }

        // O(n^3)
        // triple nested loops

        // O(2^n)
        // recursion

        // O(M*N)

        List<String> list = new ArrayList<>();

    }
}
