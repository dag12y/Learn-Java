package superAndOverriding.Overriding;

public class main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        Fish fish=new Fish();

        Car car1=new Car("Ford","Mustang",2025,"Red");

        dog.move();
        cat.move();
        fish.move();

        System.out.println(car1);
    }
}
