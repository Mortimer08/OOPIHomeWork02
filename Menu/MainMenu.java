package Menu;

import java.util.ArrayList;

/*
 * Предоставить пользователю консольный интерфейс(консольное меню), который позволяет пользователю добавлять новых животных в зоопарк,
убирать животных из зоопарка, печатать информацию о конкретном животном(вводя его номер),
печатать информацию о всех животных в зоопарке на данный момент, заставлять животное издавать звук(введя номер животное),
заставлять издавать звук всех животных, которые на данный момент есть в зоопарке
Сделать возможность у животных летать, если это животное птица, проявлять ласку, если это домашнее животное
и дрессировать, если это животное собака.
 */
public class MainMenu extends BaseMenu {
    private static ArrayList<String> items = new ArrayList<>();
    static {
        items.add("Добавить животное");
        items.add("Освободить животное");
        items.add("Показать информацию обо всех животных");
        items.add("Попросить животное покричать");
        items.add("Всех послушать");
        items.add("Пущай полетает");
        items.add("Позволить приласкаться");
        items.add("Дрессировать");
    }

    public MainMenu() {
        super(items);
        // super.showMenu();
        // System.out.println(super.userChoice());
        // switch (super.userChoice()) {
        //     case 1:
        //         AddAnimalMenu addAnimalMenu = new AddAnimalMenu();
        //         break;
        //     case 2:

        //         break;
        //     case 3:
            
        //         break;
        //     default:
        //         break;
        // }
        // menuItems = new ArrayList<>();
        // for (int index = 0; index < items.size(); index++) {
        // menuItems.add(String.format("\t%d. %s", index + 1, items.get(index)));
        // }
    }

    // public void showMenu() {
    // super.showMenu();
    // }
    // public void GetChoice(){

    // }

}
