package com.vcanus.codetest.quiz1;


public abstract class Bread {
    private final Recipe recipe;
    private final BreadType breadType;

    public Bread(
            final Recipe recipe,
            final BreadType breadType
    ) {
        this.recipe = recipe;
        this.breadType = breadType;
    }

    public Recipe recipe() {
        return recipe;
    }

    public BreadType type() {
        return breadType;
    }

    @Override
    public String toString() {
        return "\nbreadType: " + breadType.lowName() +
                "\nrecipe: " +
                "\nflour: " + recipe.flour() +
                "\nwater: " + recipe.water() +
                "\ncream: " + recipe.cream();
    }
}
