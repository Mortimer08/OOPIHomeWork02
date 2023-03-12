package Animals;

import Animals.AnimalInterfaces.MakeSound;

/*
 * 1.Кот со свойством:
1.1 Наличие шерсти(доступным только для чтения внешним классам)
 */
public class Cat extends Pet implements MakeSound {
    private Boolean hasHair;

    public Cat(Integer height, Integer weight, String eyeColor, String petName, String breed, Boolean isVaccinated,
            String hairColor, String birthDay, Boolean hasHair) {
        super(height, weight, eyeColor, petName, breed, isVaccinated, hairColor, birthDay);
        this.hasHair = hasHair;
    }

    public void makeSound() {
        System.out.println("Мурррррррр");
    }

    public void showInformation() {
        super.showInformation();

        if (hasHair) {
            System.out.printf("Цвет моей шерсти - %s%n", super.hairColor);
        } else {
            System.out.println("А шерсти у меня нет");
        }
        System.out.println("----------------");
    }

    public Boolean isHasHair() {
        return this.hasHair;
    }
}
