package com.ucaldas.proyect_testing.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.ucaldas.proyect_testing.utils.StringUtils.repeat;

public class StringUtilsTest {


    @Test
    public void repeat_caracter2() {
        Assertions.assertEquals(repeat("Hola", 2), "HolaHola");
    }

    @Test
    public void repeat_caracter0() {
        Assertions.assertEquals(repeat("Hola", 0), "");
    }

    @Test
    public void repeat_negative_test() {

         Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Exception message");
                }
        );
        Assertions.assertEquals("Exception message", exception.getMessage());


    }
}
