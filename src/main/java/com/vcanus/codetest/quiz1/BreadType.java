package com.vcanus.codetest.quiz1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum BreadType {

    CREAM {
        @Override
        public Bread newBread() {
            return new CreamBread();
        }
    },
    SUGAR{
        @Override
        public Bread newBread() {
            return new SugarBread();
        }
    },
    BUTTER{
        @Override
        public Bread newBread() {
            return new ButterBread();
        }
    };

    private final String lowName;
    private static final Map<String, BreadType> breadTypes = new HashMap<>();
    BreadType() {
        this.lowName = name().toLowerCase();
    }

    public String lowName() {
        return lowName;
    }

    protected abstract Bread newBread();

    /**
     *
     * @param breadType 찾고자 하는 타입과 일치하는 String value [대소문자 구분하지 않음]
     * @return 매개변수로 전달받은 값에 매핑되는 타입을 찾았을 때
     * @throws IllegalArgumentException 잘못된 값이 전달되었을 때
     */
    public static BreadType findTo(final String breadType) throws IllegalArgumentException{
        final BreadType type = breadTypes.get(breadType);
        if (type != null) {
            return type;
        }

        final BreadType findType = Arrays.stream(values())
                .filter(e -> breadType.toLowerCase().equals(e.lowName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("wrong value"));

        breadTypes.put(breadType, findType);

        return findType;
    }
}
