class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Unknown";
        System.out.println("Static Block is called");
    }

    public Mobile() {
        brand = "";
        price = 100;
        System.out.println("Constructor is called");
    }

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

public class StaticBlock {
    
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mobile.name = "Iphone 14 Pro Max";

        Mobile obj2 = new Mobile();
        
    }
}
