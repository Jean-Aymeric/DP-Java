package com.jad.character.behaviorhit;

import com.jad.character.Character;

public class BehaviorHitLikeATench extends BehaviorHit {
    public BehaviorHitLikeATench(final Character character) {
        super(character);
    }

    public BehaviorHitLikeATench() {
    }

    @Override
    public String hit() {
        return "je tape comme une tanche " + this.getCharacter().getHitPoints();
    }
}
