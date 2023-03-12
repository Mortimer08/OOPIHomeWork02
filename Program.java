import java.util.ArrayList;

import Animals.Animal;
import Animals.Bird;
import Animals.Cat;
import Animals.Dog;
import Animals.Galina;
import Animals.Stork;
import Animals.Tiger;
import Animals.Wolf;
import Animals.AnimalInterfaces.Fly;
import Animals.AnimalInterfaces.Snuggle;
import Animals.AnimalInterfaces.Training;
import Menu.MainMenu;


public class Program {
    public static void main(String[] args) {

        Zoo littleZoo = new Zoo();
        Zoo outside = new Zoo();
        fillOutside(outside);
        fillZoo(littleZoo);
        MainMenu mainMenu = new MainMenu();
        Boolean exit = false;
        Integer animalCount;
        Integer choice;
        while (!exit) {
            mainMenu.showMenu();
            switch (mainMenu.userChoice()) {
                case 1:
                    animalCount = outside.getAnimalsCount();
                    System.out.printf("Количество животных на свободе: %d%n", animalCount);
                    System.out.println("Введите номер животного, которое упечь в зоопарк:");
                    choice = mainMenu.userChoice();
                    if (choice <= animalCount && choice > 0) {
                        littleZoo.putAnimal(outside.getAnimal(choice - 1));
                    }
                    break;
                case 2:
                    animalCount = littleZoo.getAnimalsCount();
                    System.out.printf("Количество животных в зоопарке: %d%n", animalCount);
                    System.out.println("Введите номер животного, которое освободим:");
                    choice = mainMenu.userChoice();
                    if (choice <= animalCount && choice > 0) {
                        littleZoo.freeAnimal(choice - 1);
                    }
                    break;

                case 3:
                    littleZoo.showWholeZooInformation();
                    break;
                case 4:
                    animalCount = littleZoo.getAnimalsCount();
                    System.out.printf("Количество животных в зоопарке: %d%n", animalCount);
                    System.out.println("Введите номер животного, которое попросим покричать:");
                    choice = mainMenu.userChoice();
                    if (choice <= animalCount && choice > 0) {
                        littleZoo.makeAnimalScream(choice - 1);
                    }

                    break;

                case 5:
                    littleZoo.makeWholeZooScream();
                    break;
                case 6:
                    Integer birdsCount = littleZoo.getBirdsCount();
                    System.out.printf("Количество птиц в зоопарке: %d%n", birdsCount);
                    System.out.println("Введите номер птицы, которую отправим в полёт:");
                    ArrayList<Animal> birds = littleZoo.getAllBirds();
                    choice = mainMenu.userChoice();
                    if (choice < birdsCount) {
                        Animal birdToFly = birds.get(choice - 1);
                        birdToFly.showInformation();
                        if (choice <= birdsCount && choice > 0) {
                            System.out.println("Введите высоту полёта:");
                            choice = mainMenu.userChoice();
                            ((Bird) birdToFly).setFlyHigh(choice);
                            ((Fly) birdToFly).fly();
                        }
                    }

                    break;
                case 7:
                    Integer petsCount = littleZoo.getPetsCount();
                    System.out.printf("Количество домашних животных в зоопарке: %d%n", petsCount);
                    System.out.println("Введите номер животного, которого приласкаем:");
                    ArrayList<Animal> pets = littleZoo.getAllPets();
                    choice = mainMenu.userChoice();
                    if (choice < petsCount && choice > 0) {
                        Animal petToSnuggle = pets.get(choice - 1);
                        ((Snuggle) petToSnuggle).snuggle();
                    }

                    break;
                case 8:
                    Integer dogsCount = littleZoo.getDogsCount();
                    System.out.printf("Количество собак в зоопарке: %d%n", dogsCount);
                    System.out.println("Введите номер собаки, которую будем дрессировать:");
                    ArrayList<Animal> dogs = littleZoo.getAllDogs();
                    choice = mainMenu.userChoice();
                    if (choice < dogsCount && choice > 0) {
                        Animal dogToTraining = dogs.get(choice - 1);
                        ((Training) dogToTraining).training();
                    }
                    break;
                case 9:
                    exit = true;
                default:
                    break;
            }
        }

    }

    private static void fillOutside(Zoo outside) {
        Animal cat = new Cat(35, 5, "Красный", "Бегемот", "Русская голубая", false, "черный", "0006-06-06", false);
        Animal chicken = new Galina(25, 1, "черный");
        Animal puff = new Dog(70, 20, "Желтый", "Плуто", "Овчарка", true, "Пегий", "2018-12-21");
        Animal goophy = new Wolf(60, 60, "желтый", "Степь", "2015-11-12", false);
        Animal stork = new Stork(150, 5, "черный");
        Animal cat1 = new Cat(37, 4, "Синий", "Феофан", "Двортерьер", false, ",черный", "2015-09-02", true);
        Animal tiger = new Tiger(120, 220, "белый", "Уссурийск", "2015-08-22");
        outside.putAnimal(puff);
        outside.putAnimal(cat);
        outside.putAnimal(chicken);
        outside.putAnimal(cat1);
        outside.putAnimal(goophy);
        outside.putAnimal(stork);
        outside.putAnimal(tiger);
    }

    public static void fillZoo(Zoo littleZoo) {
        Animal cat = new Cat(35, 5, "Зелёный", "Мурзик", "Сфинкс", true, "нет", "2019-05-26", false);
        Animal chicken = new Galina(30, 2, "черный");
        Animal puff = new Dog(60, 20, "Карий", "Барбос", "Бульдог", true, "Кремовый", "2015-02-21");
        Animal goophy = new Wolf(70, 80, "желтый", "Тайга", "2020-02-16", true);
        Animal stork = new Stork(150, 5, "черный");
        Animal cat1 = new Cat(37, 4, "Синий", "Феофан", "Двортерьер", false, ",черный", "2015-09-02", true);
        littleZoo.putAnimal(puff);
        littleZoo.putAnimal(cat);
        littleZoo.putAnimal(chicken);
        littleZoo.putAnimal(cat1);
        littleZoo.putAnimal(goophy);
        littleZoo.putAnimal(stork);

    }

}