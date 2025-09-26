package OOP;

class Person {
   String name; // instance variable
   String address; // instance variable
   final String country = "Indonesia"; // constant variable    

   void sayHello(String name) { // method
    System.out.println("Hello " + name + ", my name is " + this.name);
   }
}
