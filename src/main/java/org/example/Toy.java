package org.example;

public class Toy implements Playable{
    String toyName;

    public Toy(String toyName) {
        this.toyName = toyName;
    }

    @Override
    public void play() {
        System.out.println(toyName + "is being played with.");
    }
}
