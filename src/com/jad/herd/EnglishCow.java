package com.jad.herd;

import com.jad.herd.behavior.eat.InThePastureBehavior;
import com.jad.herd.behavior.speak.MooBehavior;

public class EnglishCow extends Cow {
    public EnglishCow(final String name) {
        super(name, new InThePastureBehavior(), new MooBehavior());
    }
}
