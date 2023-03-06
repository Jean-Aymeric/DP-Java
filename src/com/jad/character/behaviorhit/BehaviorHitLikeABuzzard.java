package com.jad.character.behaviorhit;

import com.jad.character.Character;

public class BehaviorHitLikeABuzzard extends BehaviorHit {
    public BehaviorHitLikeABuzzard(final Character character) {
        super(character);
    }

    public BehaviorHitLikeABuzzard() {
    }

    @Override
    public String hitExtended() {
        return "je tape comme une buse";
    }
}
