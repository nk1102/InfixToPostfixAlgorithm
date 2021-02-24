package infix.postfix;

import java.util.Stack;
import java.util.concurrent.CopyOnWriteArraySet;

public class InfixToPostfix {
    public String infixToPostfix(String infixString) {

        String postfix = "";
        Stack<Character> stack = new Stack<>();
        stack.push('(');


    }
    private boolean isOperator(char character){
     boolean response = false;
        switch (character){
            case '^':
            case '/':
            case '*':
            case'+':
            case'-':
                response = true;

        }
        return response;
    }
}