class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow");
    }
}

public class AnimalProgram {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
        Cat c = new Cat("Kitty");

        d.display();
        d.sound();

        System.out.println();

        c.display();
        c.sound();
    }
}

