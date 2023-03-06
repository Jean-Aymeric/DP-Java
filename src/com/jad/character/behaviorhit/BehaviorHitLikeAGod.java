package com.jad.character.behaviorhit;

import com.jad.character.Character;

public class BehaviorHitLikeAGod extends BehaviorHit {
    public BehaviorHitLikeAGod(final Character character) {
        super(character);
    }

    public BehaviorHitLikeAGod() {
    }

    @Override
    public String hit() {
        return "je tape comme un dieu " + this.getCharacter().getHitPoints();
    }
}
