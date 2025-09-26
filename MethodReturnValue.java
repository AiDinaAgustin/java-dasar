public class MethodReturnValue {
    public static void main(String[] args) {
        var result = add(10, 20);
        System.out.println("Sum is: " + result);
    }

    static int add(int a, int b) {
        var sum = a + b;
        return sum;
    }
}
