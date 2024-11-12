import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the To-Do List Application!");

        do {
            System.out.println("\nAvailable commands: add, view, remove, exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter a task: ");
                    String taskDescription = scanner.nextLine();
                    Task task = new Task(taskDescription);
                    toDoList.addTask(task);
                    System.out.println("Task added: " + taskDescription);
                    break;

                case "view":
                    toDoList.viewTasks();
                    break;

                case "remove":
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    toDoList.removeTask(taskNumber);
                    break;

                case "exit":
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Unknown command. Please try again.");
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}