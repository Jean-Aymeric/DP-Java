package com.jad;

import com.jad.character.Character;
import com.jad.character.behaviorhit.BehaviorHitLikeABuzzard;
import com.jad.character.behaviorhit.BehaviorHitLikeAGod;

public class Main {

    public static void main(String[] args) {
        Character jad = new Character("Jad");
        System.out.println(jad);
        System.out.println(jad.hit());
        jad.setBehaviorHit(new BehaviorHitLikeABuzzard());
        System.out.println(jad.hit());
        jad.setBehaviorHit(new BehaviorHitLikeAGod());
        System.out.println(jad.hit());
    }
}
