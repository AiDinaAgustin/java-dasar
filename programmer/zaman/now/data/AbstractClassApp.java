package programmer.zaman.now.data;

public class AbstractClassApp {
    public static void main(String[] args) {
        // var location = new Location();  Error: Cannot instantiate the abstract class

        var city = new City();
        city.name = "Bandung";
        System.out.println(city.name);
    }
}
