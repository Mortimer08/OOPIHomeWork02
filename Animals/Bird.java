package Animals;

import Animals.AnimalInterfaces.Fly;

/*
 * Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
1.Высота полёта
и метод:
2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
и защищённый конструктор:
3.Конструктор принемающий высоту полёта
И следующие классы-наследники:
1.Курица
2.Аист
 */
public abstract class Bird extends Animal implements Fly {
    private Integer flyHigh;

    Bird(Integer height, Integer weight, String eyeColor) {
        super(height, weight, eyeColor);
        this.setFlyHigh(0);
    }

    public void setFlyHigh(Integer flyHigh) {
        this.flyHigh = flyHigh;
    }

    public Integer getFlyHigh() {
        return this.flyHigh;
    }

    public void fly() {
        if (this.getFlyHigh() == 0) {
            System.out.println("Сейчас я не летаю");
        } else {
            System.out.printf("Я лечу на высоте %d метров%n", this.getFlyHigh());
        }
        System.out.println("--------------------");
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("------------");
    }

}
