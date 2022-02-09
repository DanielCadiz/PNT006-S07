package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user1 = new User("Daniel", 2022, false);
        user1.login();
        user1.checkout();

        Admin admin1 = new Admin("Stephen", 2022, true, "admin");
        admin1.addProduct("beyblades");

        Premium userP = new Premium();
        //userP.login();
        userP.checkout();

        Regular userR = new Regular();
        //userR.login();
        userR.checkout();
    }
}
