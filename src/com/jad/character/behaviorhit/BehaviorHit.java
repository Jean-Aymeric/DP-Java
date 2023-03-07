package com.jad.character.behaviorhit;

import com.jad.character.Character;

public abstract class BehaviorHit {
    private Character character;

    public BehaviorHit(final Character character) {
        this.character = character;
    }

    public BehaviorHit() {
        this.character = null;
    }

    public final String hit() {
        return this.hitExtended() + " " + this.getCharacter().getHitPoints();
    }

    public abstract String hitExtended();

    public final Character getCharacter() {
        return character;
    }

    public final void setCharacter(final Character character) {
        this.character = character;
        if (this.character.getBehaviorHit() != this) {
            this.character.setBehaviorHit(this);
        }
    }
}
