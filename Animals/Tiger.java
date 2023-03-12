package Animals;
import Animals.AnimalInterfaces.MakeSound;

// 2.1 Тигр
public class Tiger extends WildAnimal implements MakeSound {
    public Tiger(Integer height, Integer weight, String eyeColor, String area, String findDate) {
        super(height, weight, eyeColor, area, findDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Агррррр");
    }

    public void showInformation() {
        super.showInformation();
    }
}
