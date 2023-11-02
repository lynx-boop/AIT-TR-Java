package homework.todolist;

public enum ToDoListMenu {
    //-------------------------VALUES (CONSTANTS)-----------------------------
    ADD(1, "Add a task"),
    SEE(2, "See all task"),
    DEL(3, "Delete task (by number)"),
    OUT(4, "Go out");
    //-------------------------------FIELDS-----------------------------------
    private int taskNum;
    private String action;
    //-----------------------------CONSTRUCTOR--------------------------------
    ToDoListMenu(int taskNum, String action) {
        this.taskNum = taskNum;
        this.action = action;
    }
    //--------------------------GETTERS AND SETTERS --------------------------
    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    //-------------------------------METHODS----------------------------------
    public static void printMenu(){
        ToDoListMenu[] menu = values(); //create full list of actions
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].getTaskNum() + " - " + menu[i].getAction());
        }
    };
}
