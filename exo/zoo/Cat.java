package exo.zoo;

public class Cat extends Animal {

    public Cat() {
        this.health = 8;
        this.full = 5;
        this.joy = 2;
    }

    public void eat() {
        health++;
        full += 2;
    }

    public void play() {
        joy--;
    }
}
