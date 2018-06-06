package com.jc.p3.t5.pc;

public class User {
    private boolean valid;

    public User(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        return "User{" +
                "valid=" + valid +
                '}';
    }
}
