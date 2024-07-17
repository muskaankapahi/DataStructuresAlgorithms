package Recursion;

public class SayHi {
    public static void main(String[] args){
        sayHi(3);
    }
    private static void sayHi(int count){
        System.out.println("hi!");
        if (count <= 1) //our base case
            return;
        sayHi(count-1);
    }
}
/**BASE CASE - it is a condition inside the method, where it can return without making another recursive call
 * The condition that our recursive f'n eventually needs to hit in order to avoid infinite recursion
 * However, if the base case wants it to run like a lot of times, then we run out of call stack memory
 */

