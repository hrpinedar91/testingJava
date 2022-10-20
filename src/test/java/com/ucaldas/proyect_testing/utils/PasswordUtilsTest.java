package com.ucaldas.proyect_testing.utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class PasswordUtilsTest {

    @Test
    void weak_when_less_thant8() {
        Assertions.assertEquals(PasswordUtils.SecurityLavel.WEAK, PasswordUtils.assetsPasswork("1234567"));
    }

    @Test
    void weak_when_only_caracters() {
        Assertions.assertEquals(PasswordUtils.SecurityLavel.WEAK, PasswordUtils.assetsPasswork("abcdef"));
    }

    @Test
    void w_when_caracters_num(){
        Assertions.assertEquals(PasswordUtils.SecurityLavel.WEAK, PasswordUtils.assetsPasswork("1109290"));
    }
}