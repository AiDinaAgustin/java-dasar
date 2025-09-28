package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Udin");
        employee.sayHello("Joko");

        employee = new Manager("Dina");
        employee.sayHello("Budi");

        employee = new VicePresident("Dino");
        employee.sayHello("Tono");

        sayHello(new Employee("Ucup"));
        sayHello(new Manager("Dede"));
        sayHello(new VicePresident("Dedi"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
