package lecture24;
interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore {
  
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class oopss {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
