package com.ucaldas.proyect_testing.utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class PasswordUtilsTest {

    @Test
    void weak_when_less_thant8() {
        Assertions.assertEquals(PasswordUtils.SecurityLavel.WEAK, PasswordUtils.assetsPasswork("1234567"));
    }
}