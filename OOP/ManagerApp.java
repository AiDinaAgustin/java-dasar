package OOP;

public class ManagerApp {
    public static void main(String[] args) {
        // Menggunakan class Manager sebagai Parent class
        var manager = new Manager("Dina");
        manager.sayHello("Budi");

        // Menggunakan class VicePresident sebagai Child class dari Manager
        var vp = new VicePresident("Dino");
        vp.sayHello("Tono");
    }
}
