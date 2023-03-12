package Animals;
import Animals.AnimalInterfaces.MakeSound;

public class Stork extends Bird implements MakeSound {
    public Stork(Integer height, Integer weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    @Override
    public void makeSound() {
        System.out.println("???????");
    }

    public void showInformation() {
        super.showInformation();
    }
}