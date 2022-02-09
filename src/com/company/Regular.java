package com.company;

public class Regular extends User{
    public void login() {
        System.out.println("Result from a Regular user:");
        System.out.println("Purchase today and get a 25% discount on your shipping fee!");
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
