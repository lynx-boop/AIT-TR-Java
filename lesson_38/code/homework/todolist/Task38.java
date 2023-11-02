package homework.todolist;

import java.util.Objects;

public class Task38 implements Comparable<Task38> {
    //-------------------------------FIELDS-----------------------------------
    private int id;
    private String task;
    private int taskNumber;
    //-----------------------------CONSTRUCTOR--------------------------------
    public Task38(int id, String task, int taskNumber) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }
    //--------------------------GETTERS AND SETTERS --------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }
    //-------------------------------METHODS----------------------------------
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task38 task = (Task38) o;

        // make Task38 sortable by id
        if (Integer.compare(id, task.id) != 0) return false;
        return Integer.compare(id, task.id) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // make Task38 sortable by id
    public int compareTo(Task38 o) {
        return Integer.compare(this.taskNumber, o.taskNumber);
    }
}
