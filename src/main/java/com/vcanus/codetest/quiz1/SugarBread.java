package com.vcanus.codetest.quiz1;

public class SugarBread extends Bread {

    public SugarBread() {
        super(new Recipe(100, 50, 200), BreadType.SUGAR);
    }
}