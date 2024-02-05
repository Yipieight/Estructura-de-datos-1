public class Ejercicio_2 {
    public static void main(String[] args) throws Exception {
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }
}
