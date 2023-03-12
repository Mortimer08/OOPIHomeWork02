package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import Menu.MenuInterfaces.ShowMenu;
import Menu.MenuInterfaces.UserChoice;

public abstract class BaseMenu implements ShowMenu, UserChoice {
    ArrayList<String> menuItems;
    Scanner sc = new Scanner(System.in);

    BaseMenu(ArrayList<String> items) {
        menuItems = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            menuItems.add(String.format("\t%d. %s", index + 1, items.get(index)));
        }
        menuItems.add(String.format("\t%d. Выход", items.size() + 1));
    }

    @Override
    public void showMenu() {
        System.out.println();
        for (String item : menuItems) {
            System.out.println(item);
        }
        System.out.println("Введите номер пункта меню:");
    }

    @Override
    public Integer userChoice() {

        String choice = sc.next();
        // sc.close();
        return Integer.parseInt(choice);
    }
}