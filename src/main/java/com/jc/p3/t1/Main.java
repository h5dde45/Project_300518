package com.jc.p3.t1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int size = 11;
        G1 g1 = new G1(size);
        for (int i = 0; i < size; i++) {
            g1.add(new User("User#" + i), i);
        }

        g1.users()
                .map(User::getName)
                .filter(s -> s.contains("1"))
                .forEach(System.out::println);

    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

class G1 {
    private User[] users;

    public G1(int size) {
        this.users = new User[size];
    }

    public void add(User user, int index) {
        users[index] = user;
    }

    public Stream<User> users() {
        return Arrays.stream(users);
    }
}