package org.juan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<ToDo> todoList = new ArrayList<>();
        System.out.println("Welcome to your ToDo list! \n");
        int selectedOption;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            ShowMenu();
            selectedOption = ReadOption();
            switch (selectedOption) {
                case 1:
                    PrintTodoList(todoList);
                    ConsoleDivider();
                    break;
                case 2:
                    System.out.println("Write your new task: ");
                    String task = br.readLine();
                    todoList.add(new ToDo(task, false));
                    ConsoleDivider();
                    break;
                case 3:
                    PrintTodoList(todoList);
                    if(todoList.size() > 0){
                        System.out.println("Select the task you completed: ");
                        Integer index = ReadOption();
                        todoList.get(index - 1).setCompleted(true);
                    }
                    ConsoleDivider();
                    break;
                case 4:
                    PrintTodoList(todoList);
                    if(todoList.size() > 0){
                        System.out.println("Select the task you want to delete: ");
                        Integer index = ReadOption();
                        todoList.remove(index - 1);
                    }
                    ConsoleDivider();
                    break;
                case 5:
                    PrintTodoList(todoList);
                    if(todoList.size() > 0){
                        System.out.println("Select the task you want to edit: ");
                        Integer index = ReadOption();
                        System.out.println("Write the new text: ");
                        String editedTask = br.readLine();
                        todoList.get(index-1).setTask(editedTask);
                    }
                    ConsoleDivider();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("====== Please select a correct option ======");
                    break;
            }
        } while (selectedOption != 6);
    }

    private static void PrintTodoList(List<ToDo> todoList) {
        Integer a = 0;
        System.out.println("\n");
        if (todoList.size() > 0) {
            for (ToDo e : todoList) {
                a++;
                System.out.println(a + "." + " Task: " + e.getTask() + " -- " + "Completed: " + e.getCompleted());
            }
        } else {
            System.out.println("List is empty! add new tasks");
        }
    }

    public static void ShowMenu() {
        System.out.println("\n1. Show my ToDo List");
        System.out.println("2. Add a task");
        System.out.println("3. Mark a task as completed");
        System.out.println("4. Delete task");
        System.out.println("5. Edit a task");
        System.out.println("6. Exit program\n");
        System.out.print("Select an option from the menu: ");
    }

    public static Integer ReadOption() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer i = Integer.parseInt(br.readLine());
            return i;
        } catch (NumberFormatException nfe) {
            System.err.println("Invalid Format!");
            return null;
        }
    }

    public static void ConsoleDivider() {
        System.out.println("\n Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("=======================================================");
    }
}