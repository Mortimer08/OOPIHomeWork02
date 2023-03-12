package Animals;

import java.time.LocalDate;

import Animals.AnimalInterfaces.Snuggle;

/*
 * 1.Домашнее животное со следующими свойствами:
1.1 Кличка
1.2 Порода
1.3 Наличие прививок
1.4 Цвет шерсти
1.5 Дата рождения
И методами:
1.5 Проявлять ласку
 */
public abstract class Pet extends Animal implements Snuggle {
    protected String petName;
    protected String breed;
    protected Boolean isVaccinaited;
    protected String hairColor;
    protected LocalDate birthday;

    Pet(Integer height, Integer weight, String eyeColor, String petName, String breed, Boolean isVaccinated,
            String hairColor, String birthDay) {
        super(height, weight, eyeColor);
        this.petName = petName;
        this.breed = breed;
        this.isVaccinaited = isVaccinated;
        this.hairColor = hairColor;
        this.birthday = LocalDate.parse(birthDay);
    }

    public void snuggle() {
        System.out.println("Погладь меня!");
    }

    public void showInformation() {
        super.showInformation();
        System.out.printf("Меня зовут %s, я породы %s, родился %s%n", this.petName, this.breed, this.birthday);
        if (isVaccinaited) {
            System.out.println("Я обколот со всех сторон");
        } else {
            System.out.println("Хозяин меня не прививал");
        }

    }
}
