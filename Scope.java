public class Scope {
    public static void main(String[] args) {
        sayHello("Alice");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name; // Local variable

        if (name.isBlank()) {
            String anonymous = "Anonymous"; // Local variable in if block
            hello = "Hello " + anonymous;
        }

        System.out.println(hello);
        // System.out.println(anonymous); // This will cause an error
        // System.out.println(anonymous);
    }
}
