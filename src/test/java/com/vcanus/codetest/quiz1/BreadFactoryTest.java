package com.vcanus.codetest.quiz1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreadFactoryTest {

    @ParameterizedTest
    @MethodSource("detailed")
    @DisplayName("열거 타입별 오브젝트 생성 테스트")
    void objectOfType(
            final BreadType type,
            final String typesName,
            final int flour,
            final int water,
            final int cream
    ) {
        final Bread bread = BreadFactory.findBread(typesName);
        assertEquals(bread.type(), type);
        final Recipe recipe = bread.recipe();
        assertEquals(flour, recipe.flour());
        assertEquals(water, recipe.water());
        assertEquals(cream, recipe.cream());
    }

    private static Stream<Arguments> detailed() {
        return Stream.of(
                Arguments.of(BreadType.CREAM, "cream", 100, 100, 200),
                Arguments.of(BreadType.SUGAR, "sugar", 100, 50, 200),
                Arguments.of(BreadType.BUTTER, "butter", 100, 100, 50)
        );
    }
}