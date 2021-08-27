package exo.zoo;

public class Dog extends Animal {

    public Dog() {
        health = 5;
        full = 3;
        joy = 8;
    }

    @Override
    public void play() {
        joy += 5;
    }
}
