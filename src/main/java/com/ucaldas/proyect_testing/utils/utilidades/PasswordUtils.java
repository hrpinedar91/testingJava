package com.ucaldas.proyect_testing.utils.utilidades;

public class PasswordUtils {

   public enum SecurityLavel {
       WEAK, MEDIUM, STRONG
   }

   public static SecurityLavel assetsPasswork(String password) {
       if(password.length() < 8 || password.matches("[a-zA-Z]+") || password.matches("[0-9]+")) {
           return SecurityLavel.WEAK;
       }
       if (password.matches("[a-zA-Z0-9]+") && password.length() <= 12 ) {
           return SecurityLavel.MEDIUM;
       }
       else if(password.length() > 12 && (password.matches("[a-zA-Z0-9]+"))) {
           return  SecurityLavel.STRONG;
       }
       return null;
   }
}
