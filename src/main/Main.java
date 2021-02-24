package main;

import infix.postfix.InfixToPostfix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infix11 = scanner.nextLine();
        InfixToPostfix conversion = new InfixToPostfix();
        String postfix = conversion.infixToPostfix(infix11);
        System.out.println("postfix  = " + postfix);

    }
}
