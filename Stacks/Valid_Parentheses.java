package Stacks;

import java.util.Stack;

class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> input = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{'){
                input.push(currentChar);
            }
            if (currentChar == ')'){
                if(input.isEmpty() || input.peek() != '('){
                    return false;
                }
                    input.pop();
            } else if (currentChar == ']'){
                if(input.isEmpty() || input.peek() != '['){
                    return false;
                }
                    input.pop();
            } if (currentChar == '}'){
                if(input.isEmpty() || input.peek() != '{'){
                    return false;
                }
                    input.pop();
            } 
           
        }
        return input.isEmpty();

    }
}
