package Stacks;

import java.util.Stack;

class Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> polish = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                polish.push(Integer.parseInt(token));
            } else {
                int b = polish.pop();
                int a = polish.pop();
                int result = 0;
                
                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else if (token.equals("/")) {
                    result = a / b;
                }
                
                polish.push(result);
            }
        }
        
        return polish.pop();
    }
}

