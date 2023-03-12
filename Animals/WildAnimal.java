package Animals;
import java.time.LocalDate;

/*
 * 2.Дикое животное со следующими свойствами:
2.1 Место обитания
2.2 Дата нахождения
 */
public abstract class WildAnimal extends Animal{
    protected String area;
    protected LocalDate findDate;

    WildAnimal(Integer height, Integer weight, String eyeColor, String area, String findDate) {
        super(height, weight, eyeColor);
        this.area = area;
        this.findDate = LocalDate.parse(findDate);
    }
    public void showInformation(){
        super.showInformation();
        System.out.printf("Я обитаю в этой местности: - %s%n", this.area);
        System.out.printf("Меня обнаружили %s%n", this.findDate);
    }


}
