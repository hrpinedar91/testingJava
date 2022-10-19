package com.ucaldas.proyect_testing.utils;

public class PasswordUtils {

   public enum SecurityLavel {
       WEAK, MEDIUM, STRONG
   }

   public static SecurityLavel assetsPasswork(String password) {
       return SecurityLavel.WEAK;
   }
}
