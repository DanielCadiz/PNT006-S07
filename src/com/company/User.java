package com.company;

public class User {
    private String name;
    private int joinDate;
    private boolean isAdmin;
    private boolean isLogin;

    public User() {
    }

    public User(String name, int joinDate, boolean isAdmin) {
        this.name = name;
        this.joinDate = joinDate;
        this.isAdmin = isAdmin;
        isLogin = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(int joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public void login(){
        System.out.println("Login Successful!");
        setLogin(true);
    }

    public void checkout(){
        if (isLogin() == true) {
            System.out.println("Purchase Successful!");
        } else {
            System.out.println("Please login before you can process your payment.");
        }
    }
}
