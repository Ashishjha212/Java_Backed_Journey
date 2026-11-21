
package com.kodewala.string;

public class IsDigitString {

    public static void main(String[] args) {

        String num = "1234as";

        boolean digit = true;

        if (num.length() == 0) {
            digit = false;
            System.out.println("String is empty");
        } else {
            for (int i = 0; i < num.length(); i++) {

                char ch = num.charAt(i);

                if (ch < '0' || ch > '9') {
                    digit = false;
                    break;
                }
            }
        }

        if (digit) {
            System.out.println("String contains only digit");
        } else {
            System.out.println("String contains non-digit");
        }
    
    }
}

