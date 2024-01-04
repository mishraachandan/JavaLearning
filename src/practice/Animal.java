package practice;

// Example of polymorphism in Java
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }

    void category(){
        System.out.println("This falls under dog category.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}
