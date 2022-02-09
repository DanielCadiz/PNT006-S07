package com.company;

public class Premium extends User{
    public void login() {
        System.out.println("Result from a Premium user:");
        System.out.println("View products online with free shipping!");
        setLogin(true);
    }

    public void checkout() {
        if (isLogin() == true) {
            System.out.println("Payment received. Thank you for your purchase!");
        } else {
            System.out.println("Please login before you can process your payment.");
        }
    }
}
