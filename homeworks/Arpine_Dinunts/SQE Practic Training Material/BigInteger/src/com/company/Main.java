package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BigInteger big1 = new BigInteger("2834678914526389745278963544569782587632178963");
        BigInteger big2 = new BigInteger("25987365415236492145879325412545249867422");

        BigInteger bigSum = big1.add(big2);
        BigInteger bigProduct = big1.multiply(big2);
        BigInteger bigSubtract = big1.subtract(big2);
        BigInteger bigDivide = big1.divide(big2);


        System.out.println("Sum : " + bigSum);
        System.out.println("Product : " + bigProduct);
        System.out.println("Subtract : " + bigSubtract);
        System.out.println("Divide : " + bigDivide);
    }
}
