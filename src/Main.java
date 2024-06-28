import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("BorderLands");
        stack.push("FFVII");

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("XFV"));

        //uses of stacks-
//        1. undo/redo features in text editors
//        2. moving back and forward in browser history
//        3. backtracking algorithms
//        4. calling functions
//        for(int i= 0; i < 1000000000 ; i++){
//            stack.push("FALLOUT76");
//        }


    }
}