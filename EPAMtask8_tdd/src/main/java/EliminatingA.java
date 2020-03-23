package org.example;
public class EliminatingA {
        public String omitA (String string){
            String ans = "";
            if (string.length() <= 2) {
                if (string.length() <= 1) {
                    if (string.charAt(0) == 'A' || string.charAt(0) == ' ') {
                        ans = " ";
                    } else {
                        ans = string;
                    }
                } else {
                    if (string.charAt(0) == 'A' && string.charAt(1) == 'A') {
                        ans = " ";
                    } else if (string.charAt(0) == 'A') {
                        ans = string.substring(1);
                    } else if (string.charAt(1) == 'A') {
                        ans = string.substring(0, 1);
                    } else {
                        ans = string;
                    }
                }
            } else {
                if (string.charAt(0) == 'A' && string.charAt(1) == 'A') {
                    ans = string.substring(2);
                } else if (string.charAt(0) == 'A') {
                    ans = string.substring(1);
                } else if (string.charAt(1) == 'A') {
                    ans = string.charAt(0) + string.substring(2);
                } else {
                    ans = string;
                }

            }
            return ans;


        }

    }
