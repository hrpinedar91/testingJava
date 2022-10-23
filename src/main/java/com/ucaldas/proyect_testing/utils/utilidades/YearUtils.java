package com.ucaldas.proyect_testing.utils.utilidades;

public class YearUtils {

    public static boolean div_by400(int num) {
        return num % 4 == 0;
    }

    public static boolean div100_not400(int num) {
        boolean result100 = num % 100 == 0;
        boolean result400 = num % 400 != 0;
        return result100 && result400;
    }

    public static boolean div_by_4(int num) {
        return num % 4 == 0;
    }

}
