
public class HybridInheritance {

    public static void main(String args[]) {
        Shark s1 = new Shark();
        s1.eat();
        s1.teeth = 5;
        System.out.println(s1.teeth);

    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Animal {

    int wings;

    void fly() {
        System.out.println("flies in sky");
    }
}

class Mammal extends Animal {

    int legs;

    void walks() {
        System.out.println("walks on land");
    }
}

class Shark extends Fish {

    int teeth;
}

class Peacock extends Bird {

    int feathers;
}

class Dog extends Mammal {

    String breed;
}
