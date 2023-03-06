package com.jad;

import com.jad.character.Character;
import com.jad.character.behaviorhit.BehaviorHit;
import com.jad.character.behaviorhit.BehaviorHitLikeABuzzard;
import com.jad.character.behaviorhit.BehaviorHitLikeAGod;

public class Main {

    public static void main(String[] args) {
        Character jad = new Character("Jad");
        System.out.println(jad);
        System.out.println(jad.hit());
        jad.setBehaviorHit(new BehaviorHitLikeABuzzard(jad));
        System.out.println(jad.hit());
        jad.setBehaviorHit(new BehaviorHitLikeAGod(jad));
        System.out.println(jad.hit());

        jad.setBehaviorHit(new BehaviorHit() {
            @Override
            public String hitExtended() {
                return "je tape comme un truc étrange tapé à la volée";
            }
        });
    }
}
