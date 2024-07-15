public class printNto1 {
    public static void main(String [] args){
        print(10);
    }
    public static void print (int N){
        System.out.println(N);
        if(N<=1)
            return;
        print(N-1);
    }
}