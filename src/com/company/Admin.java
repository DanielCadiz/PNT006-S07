package com.company;

public class Admin extends User{
    private String role;

    public Admin() {
    }

    public Admin(String name, int joinDate, boolean isAdmin, String role) {
        super(name, joinDate, isAdmin);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void addProduct(String product) {
        System.out.println(getName() + " just added another product.");
        System.out.println("Product " + product + " has been added.");
    }
}
