package homework.todolist;

public class ToDoListImpl implements ToDoListInterface {
    //fields
    static Task38[] tasks;
    private static int quantity;
    //constructor
    public ToDoListImpl(Task38[] tasks, int quantity) {
        this.tasks = tasks;
        this.quantity = quantity;
    }
    //methods
    @Override
    public boolean addTask(Task38 task) {
        if(task == null || quantity == tasks.length) {
            return false;
        }
        tasks[quantity] = task;
        quantity++;
        return true;
    }

    @Override
    public Task38 seeAllTasks(Task38 task) {
        return null;
    }

    @Override
    public boolean deleteTask(int id) {
        return false;
    }

    @Override
    public void goOut() {

    }
}
