package Animals;
import Animals.AnimalInterfaces.ShowInformation;

/*
 * На языке Java реализовать интерфейс "Животное" со следующими полями:
1.Рост животного
2.Вес животного
3.Цвет глаз животного
И методы:
1.Издать звук
2.Напечатать информацию о животном
 */
public abstract class Animal implements ShowInformation{
    private Integer height;
    private Integer weight;
    private String eyeColor;

    Animal(Integer height, Integer weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public void showInformation(){
        System.out.printf("Мой рост %d см, вес %d кг%n", this.height, this.weight);
        System.out.printf("Цвет моих глаз %s%n", this.eyeColor);
    }
}
