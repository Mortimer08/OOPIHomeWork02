package Animals;
import Animals.AnimalInterfaces.MakeSound;

/*
 * 4.Волк со свойством:
4.1 Вожак стаи(доступным только для чтения внешним классам)
 */
public class Wolf extends WildAnimal implements MakeSound {
    private Boolean isBoss;

    public Wolf(Integer height, Integer weight, String eyeColor, String area, String findDate, Boolean isBoss) {
        super(height, weight, eyeColor, area, findDate);
        this.isBoss = isBoss;
    }

    public Boolean isBoss() {
        return this.isBoss;
    }

    @Override
    public void makeSound() {
        System.out.println("Ауууууууууу");
    }

    public void showInformation() {
        super.showInformation();
        if (isBoss) {
            System.out.printf("Я шерстяной волчара,%nБоже, как я хорош,%nКак мощны мои лапищи!%n");
        } else {
            System.out.printf("Кто там первый, а?%nНельзя ли рыть тропу прямо?");
        }
        System.out.println("----------------");
    }
}
