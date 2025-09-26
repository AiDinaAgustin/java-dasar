public class MethodReturnValue {
    public static void main(String[] args) {
        var result = add(10, 20);
        System.out.println("Sum is: " + result);

        System.out.println(hitung(100, "*", 200));

    }

    static int add(int a, int b) {
        var sum = a + b;
        return sum;
    }

    static int hitung(int value1, String operator, int value2) {
        return switch (operator) {
            case "+" -> value1 + value2;
            case "-" -> value1 - value2;
            case "*" -> value1 * value2;
            case "/" -> value1 / value2;
            default -> 0;
        };
    }
}
