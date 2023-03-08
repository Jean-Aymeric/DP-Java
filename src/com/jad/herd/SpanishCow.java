package com.jad.herd;

import com.jad.herd.behavior.eat.InThePastureBehavior;
import com.jad.herd.behavior.speak.MuuuBehavior;

public class SpanishCow extends Cow {
    public SpanishCow(final String name) {
        super(name, new InThePastureBehavior(), new MuuuBehavior());
    }
}
