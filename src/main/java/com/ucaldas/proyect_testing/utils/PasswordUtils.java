package com.ucaldas.proyect_testing.utils;

public class PasswordUtils {

   public enum SecurityLavel {
       WEAK, MEDIUM, STRONG
   }

   public static SecurityLavel assetsPasswork(String password) {
       if(password.length() < 8 || password.matches("[a-zA-Z]+")) {
           return SecurityLavel.WEAK;
       }
       if (password.matches("[a-zA-Z0-9]")) {
           return SecurityLavel.MEDIUM;
       }

       return SecurityLavel.WEAK;
   }
}
