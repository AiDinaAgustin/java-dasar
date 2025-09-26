class Mobile {
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println("Brand Ini: " + obj.brand);
        System.out.println("Price: " + obj.price);
        System.out.println("Name: " + name);
    }
}

public class StaticMethod {
    
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mobile.name = "Iphone 14 Pro Max";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 80000;
        Mobile.name = "Samsung S23 Ultra";

        // Changing static variable value
        // Diubah nilai variable static dan semua objek akan terpengaruh
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        System.out.println();

        // Using static method to show details
        // Dengan cara ini kita harus mengirim objek sebagai parameter
        // dan kita tidak perlu mengubah nilai static variable
        Mobile.show1(obj1);
        Mobile.show1(obj2);
        
    }
}
