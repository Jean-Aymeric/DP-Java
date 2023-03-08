package com.jad.herd;

import com.jad.herd.behavior.eat.AtThFootOfMountFujiBehavior;
import com.jad.herd.behavior.eat.InThePastureBehavior;
import com.jad.herd.behavior.speak.MooBehavior;
import com.jad.herd.behavior.speak.MouBehavior;

public class JapanCow extends Cow {
    public JapanCow(final String name) {
        super(name, new AtThFootOfMountFujiBehavior(), new MouBehavior());
    }
}
