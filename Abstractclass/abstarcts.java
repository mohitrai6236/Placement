package Abstractclass;
abstract class Animal {
    abstract void walk();
    Animal() {
        System.out.println("You are creating a new animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}


public class abstarcts {
     public static void main(String[] args) {
        Horse horse = new Horse();
    }
}
