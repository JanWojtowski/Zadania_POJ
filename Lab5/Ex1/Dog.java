package Lab5.Ex1;

public class Dog extends Animal{
    public Dog(String name, String color){
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Hau hau. " + super.makeSound();
    }
}
