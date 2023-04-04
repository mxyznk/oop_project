import java.util.*;
public class ToDoList {
    private List<Task> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void markTaskAsComplete(Task task) {
        task.setIsComplete(true);
    }

    public void markTaskAsIncomplete(Task task) {
        task.setIsComplete(false);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}