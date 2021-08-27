package exo.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("toto", 1);
        myMap.put("toto", 2);
        System.out.println(myMap.get("toto"));
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void playWithThem() {
        animals.forEach(animal -> {
            animal.play();
            if (animal.isDead()) {
                System.out.println(animal.getClass() + " is dead");
            }
        });
    }

    public int sizeOfZoo() {
        return animals.size();
    }

    public void displayAnimalsInfo() {
        animals.forEach(Animal::displayInfo);
    }
}
