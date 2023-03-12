package Animals;

import Animals.AnimalInterfaces.MakeSound;

public class Galina extends Bird implements MakeSound {
    public Galina(Integer height, Integer weight, String eyeColor) {
        super(height, weight, eyeColor);
    }

    @Override
    public void makeSound() {
        System.out.println("Кококо");
    }
}
