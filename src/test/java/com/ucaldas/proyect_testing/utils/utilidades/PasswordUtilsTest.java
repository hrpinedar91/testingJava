package com.ucaldas.proyect_testing.utils.utilidades;
import com.ucaldas.proyect_testing.utils.utilidades.PasswordUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {

    @Test
    void weak_when_less_thant8() {
        assertEquals(PasswordUtils.SecurityLavel.WEAK, PasswordUtils.assetsPasswork("1234567"));
    }

    @Test
    void weak_when_only_caracters() {
        assertEquals(PasswordUtils.SecurityLavel.WEAK, PasswordUtils.assetsPasswork("abcdef"));
    }

    @Test
    void w_when_caracters_num(){
        assertEquals(PasswordUtils.SecurityLavel.WEAK, PasswordUtils.assetsPasswork("1109290"));
    }

    @Test
    void medium_when_caracteres_num(){
        assertEquals(PasswordUtils.SecurityLavel.MEDIUM, PasswordUtils.assetsPasswork("1109290301aA"));
    }

    @Test
    void strong_when_caracter_num_more12() {
       assertEquals(PasswordUtils.SecurityLavel.STRONG, PasswordUtils.assetsPasswork("11092903rtdscf2"));
    }
}