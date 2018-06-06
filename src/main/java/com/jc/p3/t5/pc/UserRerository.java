package com.jc.p3.t5.pc;

import java.util.HashSet;
import java.util.Set;

public class UserRerository {
    private Set<User> users = new HashSet<>();

    void addUser(User user) {
        users.add(user);
    }

    void validateUser(User user) {
        if (!user.isValid()) {
            users.remove(user);
        }
    }

    void validateAll() {
        for (User user : users) {
            validateUser(user);
        }
    }

    public Set<User> getUsers() {
        return users;
    }
}
