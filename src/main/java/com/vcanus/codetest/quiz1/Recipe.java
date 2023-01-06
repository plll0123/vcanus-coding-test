package com.vcanus.codetest.quiz1;

public class Recipe {
    private final int flour;
    private final int water;
    private final int cream;

    public Recipe(final int flour, final int water, final int cream) {
        this.flour = flour;
        this.water = water;
        this.cream = cream;
    }

    public int cream() {
        return cream;
    }

    public int flour() {
        return flour;
    }

    public int water() {
        return water;
    }
}