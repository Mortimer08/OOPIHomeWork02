package Animals;
import Animals.AnimalInterfaces.MakeSound;
import Animals.AnimalInterfaces.Training;

/*
 * 3.Собака со свойством:
3.1 Наличие дрессировки(доступным только для чтения внешним классам)
и методом:
3.2 Дрессировать
 */
public class Dog extends Pet implements MakeSound, Training {
    private Boolean hasTrained;

    public Dog(Integer height, Integer weight, String eyeColor, String petName, String breed, Boolean isVaccinated,
            String hairColor, String birthDay) {
        super(height, weight, eyeColor, petName, breed, isVaccinated, hairColor, birthDay);
        this.hasTrained = false;
    }

    public void makeSound() {
        System.out.println("Гав два раза");
    }

    public void showInformation() {
        super.showInformation();
        System.out.printf("Цвет шерсти - %s%n", super.hairColor);
        if (hasTrained) {
            System.out.println("Я послушный пёс, меня дрессировали");
        } else {
            System.out.println("Меня не дрессировали");
        }
        System.out.println("----------------");
    }
    public Boolean isTrained(){
        return this.hasTrained;
    }
    public void training(){
        System.out.println("Дрессируй меня полностью!");
        this.hasTrained = true;
    }
}
