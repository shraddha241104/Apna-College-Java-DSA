public class AbstractClasses {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        // Animal --> Horse --> Mustang
    }
}
abstract class Animal {
    String color;
    Animal(){
        color = "brown";
        System.out.println("animal constructor called...");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called...");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}