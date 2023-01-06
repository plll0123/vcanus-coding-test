package com.vcanus.codetest.quiz1;

public class BreadFactory {

    private BreadFactory() {
        throw new AssertionError("can't called constructor.");
    }

    public static Bread findBread(final String value) {
        return BreadType.findTo(value)
                .newBread();
    }
}
