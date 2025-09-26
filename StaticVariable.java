class Mobile {
    String brand;
    int price;
    String name;

    public void show()
    {
        System.out.println(brand + " " + price + " " + name);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        obj1.name = "iPhone 13";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 80000;
        obj2.name = "Galaxy S21";

        obj1.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
