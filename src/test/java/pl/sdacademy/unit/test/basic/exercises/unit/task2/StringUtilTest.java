package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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

}