package infix.postfix;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

public class InfixToPostfix {
    public String infixToPostfix(String infixString) {

        String postfix = "";
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        infixString = infixString.concat(""+')');
        for (int i = 0; i <infixString.length() ; i++) {
            char character = infixString.charAt(i);
            if (Character.isAlphabetic(character)){
                postfix=postfix.concat(""+ character);


            }
            else if (character=='('){
                stack.push(character);
            }

        }



    }

    private boolean isOperator(char character) {
        boolean response = false;
        switch (character) {
            case '^':
            case '/':
            case '*':
            case '+':
            case '-':
                response = true;

        }
        return response;
    }

    private int precendence(char operator) {
        int response = 0;
        switch (operator){
            case'^':
                response=3;
            case'/':
            case'*':
                response=2;
                break;
            case'+':
            case'-':
                response=1;
        }


    }
}