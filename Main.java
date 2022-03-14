package com.costrategix.training;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteValue=10;
        short shortValue=20;
        int intValue=50;
        long longTotal=50000L + 10L*(byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal=(short)(10000+100*(byteValue + shortValue + intValue));

    }
}
