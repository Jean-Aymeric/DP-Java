package com.jad.herd.behavior;

import com.jad.herd.Cow;

public abstract class CowBehavior implements ICowBehavior {
    private Cow cow;

    @Override
    public Cow getCow() {
        return cow;
    }

    @Override
    public void setCow(final Cow cow) {
        this.cow = cow;
    }
}
