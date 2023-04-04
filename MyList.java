import java.util.*;

public class MyList {
    private static Scanner input = new Scanner(System.in);
    private static ToDoList toDoList = new ToDoList();

    public static void main(String[] args) {
        boolean quit = false;
        printMenu();
        while (!quit) {
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    markTaskAsComplete();
                    break;
                case 4:
                    markTaskAsIncomplete();
                    break;
                case 5:
                    printTasks();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Welcome to your To-Do List!");
        System.out.println("---------------------------");
        System.out.println("1. Add task");
        System.out.println("2. Remove task");
        System.out.println("3. Mark task as complete");
        System.out.println("4. Mark task as incomplete");
        System.out.println("5. Print tasks");
        System.out.println("0. Quit");
    }

    private static void addTask() {
        System.out.print("Enter task type (1 for shopping, 2 for study, 3 for other, 0 to go back): ");
        int taskType = input.nextInt();
        input.nextLine(); // consume newline character

        if (taskType == 1) {
            System.out.print("Enter task name: ");
            String taskName = input.nextLine();
            System.out.print("Enter item name: ");
            String itemName = input.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine(); // consume newline character
            Task task = new ShoppingTask(taskName, itemName, quantity);
            toDoList.addTask(task);
            printMenu();
        } 
        
        else if (taskType == 2) {
            System.out.print("Enter subject name: ");
            String subjectName = input.nextLine();
            System.out.print("Enter task name: ");
            String taskName = input.nextLine();
            System.out.print("Enter date: ");
            int date = input.nextInt();
            input.nextLine(); // consume newline character
            Task task = new StudyTask(taskName, subjectName, date);
            toDoList.addTask(task);
            printMenu();
        } 
        
        else if (taskType == 3) {
            System.out.print("Enter task name: ");
            String taskName = input.nextLine();
            Task task = new Task(taskName);
            toDoList.addTask(task);
            printMenu();
        } 
        
        else {
            System.out.println("Invalid task type. Going back");
        }
    }

    private static void removeTask() {
        System.out.print("Enter task number to remove: ");
        int taskNumber = input.nextInt();
        input.nextLine(); // consume newline character
        if (taskNumber > 0 && taskNumber <= toDoList.getTasks().size()) {
            Task task = toDoList.getTasks().get(taskNumber - 1);
            toDoList.removeTask(task);
            System.out.println("Task removed: " + task.getTaskName());
        } 
        
        else {
            System.out.println("Invalid task number.");
        }
    }

    private static void markTaskAsComplete() {
        System.out.print("Enter task number to mark as complete: ");
        int taskNumber = input.nextInt();
        input.nextLine(); // consume newline character
        if (taskNumber > 0 && taskNumber <= toDoList.getTasks().size()) {
            Task task = toDoList.getTasks().get(taskNumber - 1);
            toDoList.markTaskAsComplete(task);
            System.out.println("Task marked as complete: " + task.getTaskName());
        } 
        
        else {
            System.out.println("Invalid task number.");
        }
    }
    
    private static void markTaskAsIncomplete() {
        System.out.print("Enter task number to mark as incomplete: ");
        int taskNumber = input.nextInt();
        input.nextLine(); // consume newline character
        if (taskNumber > 0 && taskNumber <= toDoList.getTasks().size()) {
            Task task = toDoList.getTasks().get(taskNumber - 1);
            toDoList.markTaskAsIncomplete(task);
            System.out.println("Task marked as incomplete: " + task.getTaskName());
        } else {
            System.out.println("Invalid task number.");
        }
    }
    
    public static void printTasks() {
        List<Task> tasks = toDoList.getTasks();
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status;
            if (task.getIsComplete()) {
                status = "Complete";
            } else {
                status = "Incomplete";
            }
            System.out.print((i + 1) + ". " + task.getTaskName() + " [" + status + "]");
            System.out.println();
        }
        System.out.println();
    }

}
