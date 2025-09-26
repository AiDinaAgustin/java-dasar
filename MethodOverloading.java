public class MethodOverloading {
    public static void main(String[] args) {
        sayHello("Alice", 30);
        sayHello();
    }

    // Method Overloading: same method name, different parameters
    static void sayHello(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    // Overloaded method with no parameters
    static void sayHello() {
        System.out.println("Hello, Guest!");
    }
}
