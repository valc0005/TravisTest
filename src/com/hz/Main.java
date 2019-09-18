package com.hz;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculatePrice());
    }

    public static double calculatePrice() {
        int basePrice = 3;
        int itemPrice = 2;
        int quantity = 6;
        double quantityDiscount = 0;
        double shipping;

        basePrice = quantity * itemPrice;
        shipping = Math.min(basePrice * 0.1, 100);
        return basePrice - quantityDiscount + shipping;
    }
}
