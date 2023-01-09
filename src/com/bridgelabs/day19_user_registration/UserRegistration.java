package com.bridgelabs.day19_user_registration;

import java.util.regex.Pattern;

public class UserRegistration {
        public boolean validateName(String name)
        {
            Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
            boolean matches = pattern.matcher(name).matches();
            return matches;
        }
    public boolean validateEmail(String email) {
/*        E.g. abc.xyz@bl.co.in
        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
        with precise @ and . positions
 */
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([!@#$%^&*()_+.,][a-zA-Z0-9]+)*[@][a-zA-Z]{2,}[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$");
        boolean matches = pattern.matcher(email).matches();
        return matches;
    }
}