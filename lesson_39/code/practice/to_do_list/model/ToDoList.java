package practice.to_do_list.model;

public interface ToDoList {
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int id);

    // print list of Tasks
    void viewTask();
    // TODO think about Task[] viewTask();

    // quantity of tasks
    int quantity();
}
