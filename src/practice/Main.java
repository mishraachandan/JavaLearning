package practice;

public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.brand = "Toyota";
//        myCar.year = 2022;
//        myCar.start();

        // Create a Person object
        Person person = new Person("Alice", 30, "female");

        // Access and modify attributes using getters and setters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        // Attempt to modify attributes
        person.setName("Bob");
        person.setAge(150); // This won't work (out of reasonable range)
        person.setGender("other"); // This won't work (not a valid gender)

        // Display updated attributes
        System.out.println("Name: " + person.getName()); // Name remains "Alice"
        System.out.println("Age: " + person.getAge()); // Age remains 30
        System.out.println("Gender: " + person.getGender()); // Gender remains "female"
    }
}
