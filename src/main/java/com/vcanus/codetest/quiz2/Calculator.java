package com.vcanus.codetest.quiz2;

/**
 * 구현자의 선택에 따라 구현 방법을 정의하도록 추상 클래스로 작성
 * ex)
 * Math.addExact()는 오버플로우에 대한 예외를 가정한다.
 * Integer.sum()은 오버플로에 대한 예외 상황을 가정하지 않는다.
 */
public abstract class Calculator {

    /**
     * 선택에 따라 초기값을 가지게 할 수 있음
     */
    public static class CalculatorBuilder extends Calculator{
        private int number;

        public CalculatorBuilder() {
        }

        public CalculatorBuilder(int a) {
            this.number = a;
        }

        @Override
        public CalculatorBuilder add(final int a) {
            number += a;
            return this;
        }

        @Override
        public CalculatorBuilder subtract(final int a) {
            number -= a;
            return this;
        }

        @Override
        public int out() {
            return number;
        }
    }

    public abstract CalculatorBuilder add(final int a);
    public abstract CalculatorBuilder subtract(final int a);
    public abstract int out();
}
