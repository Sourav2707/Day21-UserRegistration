package com.bridgelabs.day19_user_registration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 19 user registration program");
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name to validate");
        String firstName = scanner.next();
        if (user.validateName(firstName) == true)
            System.out.println("Valid input first name");
        else
            System.out.println("Invalid input first name");
        System.out.println("Enter the first name to validate");
        String lastName = scanner.next();
        if (user.validateName(lastName) == true)
            System.out.println("Valid input last name");
        else
            System.out.println("Invalid input last name");
        System.out.println("Enter the email id");
        String email = scanner.next();
        if (user.validateEmail(email) == true)
            System.out.println("Valid input email");
        else
            System.out.println("Invalid input email");
    }
}