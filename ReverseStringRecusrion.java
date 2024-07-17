import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    char[] s = {'a', 'b', 'c'};
    int size = s.length -1;
    System.out.println(check(s, 0, size ));
  }
  public static boolean check(char[] s, int start, int end){
    if(start>= end)
      return false;
    if(s[start] == s[end]){
      check(s, start + 1, end -1);
    }
    else return false;

    return true;
  }
}

/*if a string to be reversed - 

public static String reverse(String str) {
    if ((null == str) || (str.length() <= 1)) {
        return str;
    }
    return reverse(str.substring(1)) + str.charAt(0);
}
*/
