package com.jad.herd;

import com.jad.herd.behavior.eat.InThePastureBehavior;
import com.jad.herd.behavior.speak.MeuhBehavior;

public class FrenchCow extends Cow {
    public FrenchCow(final String name) {
        super(name, new InThePastureBehavior(), new MeuhBehavior());
    }
}
