package OOP;

public class PersonApp {
    public static void main(String[] args) {
        var person = new Person();
        person.name = "Dina";
        person.address = "Bandung";
        // person.country = default value "Indonesia" karena final variable
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
    
}
