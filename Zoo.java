import java.util.ArrayList;

import Animals.Animal;
import Animals.Bird;
import Animals.Dog;
import Animals.Pet;
import Animals.AnimalInterfaces.Fly;
import Animals.AnimalInterfaces.MakeSound;

public class Zoo {
    private ArrayList<Animal> zoo;

    Zoo() {
        zoo = new ArrayList<>();
    }

    public Integer getAnimalsCount() {
        return zoo.size();
    }

    public Integer getBirdsCount() {
        Integer birdsCount = 0;
        for (int index = 0; index < zoo.size(); index++) {
            if (zoo.get(index) instanceof Fly) {
                birdsCount++;
            }
        }
        return birdsCount;
    }

    public Integer getPetsCount() {
        Integer petsCount = 0;
        for (int index = 0; index < zoo.size(); index++) {
            if (zoo.get(index) instanceof Pet) {
                petsCount++;
            }
        }
        return petsCount;
    }

    public Integer getDogsCount() {
        Integer dogsCount = 0;
        for (int index = 0; index < zoo.size(); index++) {
            if (zoo.get(index) instanceof Dog) {
                dogsCount++;
            }
        }
        return dogsCount;
    }

    public Animal getAnimal(Integer animalNumber) {
        if (animalNumber <= zoo.size()) {
            return zoo.get(animalNumber);
        }
        return null;
    }

    public ArrayList<Animal> getAllBirds() {
        ArrayList<Animal> birdsCage = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof Bird) {
                birdsCage.add(animal);
            }
        }
        return birdsCage;
    }

    public ArrayList<Animal> getAllPets() {
        ArrayList<Animal> petsCage = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof Pet) {
                petsCage.add(animal);
            }
        }
        return petsCage;
    }

    public ArrayList<Animal> getAllDogs() {
        ArrayList<Animal> dogsCage = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof Dog) {
                dogsCage.add(animal);
            }
        }
        return dogsCage;
    }

    public void putAnimal(Animal animal) {
        zoo.add(animal);
    }

    public void freeAnimal(Integer animalNumber) {
        if (animalNumber < zoo.size()) {
            zoo.remove(animalNumber - 1);
        }
    }

    public void showAnimalInformation(Integer animaNumber) {
        zoo.get(animaNumber).showInformation();
    }

    public void makeAnimalScream(Integer animaNumber) {
        ((MakeSound) zoo.get(animaNumber)).makeSound();
    }

    public void showWholeZooInformation() {
        System.out.println("Вот информация обо всех животных в зоопарке:");
        System.out.println();
        for (Animal animal : zoo) {
            animal.showInformation();
        }
    }

    public void makeWholeZooScream() {
        for (Animal animal : zoo) {
            ((MakeSound) animal).makeSound();
        }
    }
}
