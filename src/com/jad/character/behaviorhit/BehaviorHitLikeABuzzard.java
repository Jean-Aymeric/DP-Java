package com.jad.character.behaviorhit;

import com.jad.character.Character;

public class BehaviorHitLikeABuzzard extends BehaviorHit {
    public BehaviorHitLikeABuzzard(final Character character) {
        super(character);
    }

    public BehaviorHitLikeABuzzard() {
    }

    @Override
    public String hit() {
        return "je tape comme une buse " + this.getCharacter().getHitPoints();
    }
}
