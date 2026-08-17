package zoo;

public class Zoo {

    public static void main(String[] args) {

        Bird b = new Bird();
        Dog d = new Dog();

        b.makeSound();
        b.move();

        d.makeSound();
        d.move();
    }
}