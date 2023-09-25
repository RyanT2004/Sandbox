package org.example.Arrays;

public class Arrays {

    public static void main(String[] args) {

        //one way to format array
        Integer[] arr = new Integer[20];

        //second way to format
        for(int i = 0; i < arr.length; i++){
            arr[1] = 0;
        }

        System.out.println(arr.length);
    }
}
