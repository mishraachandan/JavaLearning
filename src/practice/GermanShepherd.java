package practice;
// concept of inheritance and polymorphism.
public class GermanShepherd extends Dog{

    @Override
    void category(){
        System.out.println("This is german shepherd.");
    }

    @Override
    void makeSound(){
        System.out.println("It make german sound.");
    }

    public static void main(String[] args) {
        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.makeSound();
        germanShepherd.category();

        Dog dog = new GermanShepherd();
        // does implementation of german shepherd.
        dog.makeSound();
        dog.category();

        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.category();

        Animal animal = new Dog();
        animal.makeSound();




    }
}
