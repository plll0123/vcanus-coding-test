package com.vcanus.codetest.quiz1;

public class ButterBread extends Bread{

    public ButterBread() {
        super(new Recipe(100, 100, 50), BreadType.BUTTER);
    }
}
