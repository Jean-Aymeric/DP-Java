package com.jad;

import com.jad.character.Character;

public class Main {

    public static void main(String[] args) {
        Character jad = new Character("Jad");
        System.out.println(jad);
        System.out.println(jad.hit());
    }
}
