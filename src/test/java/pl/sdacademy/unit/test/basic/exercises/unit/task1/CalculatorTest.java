package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        //given
        Calculator calculator = new Calculator();
        int expectedResult = 5;
        //when
        int result = calculator.add(2, 3);
        //then
        assertEquals(expectedResult, result); // jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }
}