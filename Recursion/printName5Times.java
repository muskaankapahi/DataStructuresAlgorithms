public class printName5Times {
    public static void main(String[] args) {
        sayHi(5);
    }

    public static void sayHi(int count) {
        System.out.println("Muskaan");
        if (count <= 1) {
            return;
        }
        sayHi(count - 1);
    }
}