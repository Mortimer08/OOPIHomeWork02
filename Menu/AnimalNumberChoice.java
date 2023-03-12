package Menu;

import java.util.ArrayList;

public class AnimalNumberChoice extends BaseMenu{
    private static ArrayList<String> items = new ArrayList<>();
    // static {
    //     items.add("Добавить кота");
    //     items.add("Добавить пса");
    //     items.add("Добавить тигра");
    //     items.add("Добавить волка");
    //     items.add("Добавить курицу");
    //     items.add("Добавить аиста");
    // }

    AnimalNumberChoice () {
        super(items);
        // super.userChoice();
    }

}
