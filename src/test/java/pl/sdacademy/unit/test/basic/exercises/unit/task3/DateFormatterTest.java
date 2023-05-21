package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateFormatterTest {

    /*
    input: 2023-04-20
    output: 2023-20-04
     */

    @Test
    void shouldReturnCorrectFormatDate() {
        //given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate input = LocalDate.of(2023, 04, 20);
        String expectedResult = "2023-20-04";
        //when
        String result = dateFormatter.formatDate(input);
        //then
        assertEquals(expectedResult, result); //jUnit
        assertThat(result).isEqualTo(expectedResult); //assertJ
    }
}