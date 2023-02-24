package com.jad;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        for (int i = 0; i < 10; i++) {
            client.eat();
        }
    }
}
