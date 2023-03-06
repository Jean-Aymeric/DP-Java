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

    public abstract String hit();

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(final Character character) {
        this.character = character;
        if (this.character.getBehaviorHit() != this) {
            this.character.setBehaviorHit(this);
        }
    }
}
