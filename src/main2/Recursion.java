package main2;

import java.math.BigInteger;

public class Recursion
{
    static BigInteger factorial(BigInteger num) {

        if (num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }


        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }
    public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf((17000))));
    }
}
