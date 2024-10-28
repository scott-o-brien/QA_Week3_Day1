package org.example;

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    @Override
    public void makeSound() {
        System.out.println("Some mammal sound.");
    }

    @Override
    public void eat() {
        System.out.println(name + " (a mammal) is munching on food.");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    @Override
    public void makeSound() {
        System.out.println("Some bird sound.");
    }

    @Override
    public void eat() {
        System.out.println(name + " (a bird) is pecking at food.");
    }
}

class Dog extends Mammal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    public void fetch() {
        System.out.println(name + " is fetching.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is chewing on a bone.");
    }
}

class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk!");
    }

    public void repeatWords(String words) {
        System.out.println(name + " repeats: " + words);
    }

    @Override
    public void eat() {
        System.out.println(name + " is cracking seeds with its beak.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rodger", 5);
        Parrot myParrot = new Parrot("Charlie", 3);
        Mammal genericMammal = new Mammal("Generic Rodger", 4);
        Bird genericBird = new Bird("Generic Charlie", 2);

        Animal[] animals = { myDog, myParrot, genericMammal, genericBird };

        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.name);
            animal.makeSound();
            animal.eat();
            System.out.println();
        }
    }
}
