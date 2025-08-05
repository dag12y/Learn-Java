package Inheritance;

public class main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        plant plant=new plant();

        dog.eat();
        cat.eat();

        dog.speaks();
        cat.speaks();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        plant.photosynthesize();
    }
}
