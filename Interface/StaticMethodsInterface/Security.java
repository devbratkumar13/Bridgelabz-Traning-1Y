package com.gla.Interface.StaticMethodsInterface;
interface SecurityUtil {

    static boolean isStrongPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }
}
public class Security {
    public static void main(String[] args) {
        String password = "Pass1234";

        if (SecurityUtil.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
