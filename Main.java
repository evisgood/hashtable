package com.company;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++)
            System.out.printf("Fibonacci of %d is: %d\n", i, fiboRec(i));
    }

            public static long fiboRec(long number) {

                if ((number == 0) || (number == 1))
                    return number;
                else
                    return fiboRec(number - 1) + fiboRec(number - 2);
            }


        }# examminor
