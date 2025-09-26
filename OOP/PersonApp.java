package OOP;

public class PersonApp {
    public static void main(String[] args) {

        // Menggunakan constructor dengan 2 parameter
        var person = new Person("Dina", "Bandung");
        // person.name = "Dina";
        // person.address = "Bandung";
        // person.country = default value "Indonesia" karena final variable
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello( "Budi");

        // Menggunakan constructor dengan 1 parameter
        var person2 = new Person("Rina");
        person2.sayHello("Siti");

        // Menggunakan constructor tanpa parameter
        var person3 = new Person();
        person3.name = "Andi";
        person3.sayHello("Joko");

    }
    
}
