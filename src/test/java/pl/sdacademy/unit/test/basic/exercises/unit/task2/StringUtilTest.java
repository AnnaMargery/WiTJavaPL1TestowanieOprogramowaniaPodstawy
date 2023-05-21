package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilTest {
    
    /*
    true:
        null
        "    "
        ""
    
    false:
        "programowanie"
        "java     "
     */

    @Test
    void shouldReturnTrueIfInputIsNull() {
        //when
        boolean result = StringUtil.isBlank(null);
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfInputIsEmpty() {
        //when
        boolean result = StringUtil.isBlank("");
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfInputIsEmptyWithSpaces() {
        //when
        boolean result = StringUtil.isBlank("    ");
        //then
        assertTrue(result); //jUnit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfInputISNotEmpty() {
        //when
        boolean result = StringUtil.isBlank("programowanie");
        //then
        assertFalse(result); //jUnit
        assertThat(result).isFalse(); //assertJ
    }

    @Test
    void shouldReturnFalseIfInputISNotEmpty_2() {
        //when
        boolean result = StringUtil.isBlank("java    ");
        //then
        assertFalse(result); //jUnit
        assertThat(result).isFalse(); //assertJ
    }

}