package programmer.zaman.now.application;

import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

public class AbtractMethodApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Luna";
        animal.run();
    }
}
