package exo.zoo;

public abstract class Animal {
    protected int health;
    protected int full;
    protected int joy;

    public void eat() {
        full += 3;
    }

    public abstract void play();

    public boolean isDead() {
        return joy == 0 || health == 0 || full == 0;
    }

    public void displayInfo() {
        System.out.println(getClass() + " health: " + health + " full: " + full + " joy: " + joy);
    }
}
