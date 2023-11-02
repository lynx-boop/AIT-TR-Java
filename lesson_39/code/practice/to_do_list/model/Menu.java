package practice.to_do_list.model;

public enum Menu {
    ADD(1, "Add"), LIST(2, "List"), REMOVE(3, "Remove"), EXIT(4, "Exit");

    //fields
    private int menuItem;
    private String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
        Menu[] menu = Menu.values();


        for (int i = 0; i < menu.length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        //TODO replace with for-each
        System.out.println();
    }
}
