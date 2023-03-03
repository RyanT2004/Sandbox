package org.example.lambda;

import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {
        //lambdas is an anonymous function

        //in line lambda
        // x -> x * 2

        //4 types of lambdas

        // takes a value, returns a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // takes a value, returns a value
        Function<Integer,Integer> function = x -> x * 2; // aka pure function

        // takes nothing, returns a value
        Supplier<String> supplier = () -> "Hello Lambda";

        // takes a value, returns nothing
        Consumer<Integer> consumer = Integer::toOctalString;
    }





}
