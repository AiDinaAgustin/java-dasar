package OOP;

class Person {
   String name; // instance variable
   String address; // instance variable
   final String country = "Indonesia"; // constant variable    

   Person(String paramName, String paramAddress) { // constructor
    name = paramName;
    address = paramAddress;
   }

   Person(String paramName) { // constructor
    name = paramName;
   }

   Person() { // constructor
   }

   void sayHello(String name) { // method
    System.out.println("Hello " + name + ", my name is " + this.name);
   }
}
