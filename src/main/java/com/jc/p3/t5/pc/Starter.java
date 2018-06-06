package com.jc.p3.t5.pc;

public class Starter {
    public static void main(String[] args) {
        UserRerository userRerository = new UserRerository();
        userRerository.addUser(new User(true));
        userRerository.addUser(new User(false));
        System.out.println(userRerository.getUsers());
        userRerository.validateAll();
        System.out.println(userRerository.getUsers());


    }
}
