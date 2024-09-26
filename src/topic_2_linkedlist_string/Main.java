package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {

    public static LinkedList list = new LinkedList();
    public static Scanner in = new Scanner(System.in);

    public static void adding() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("Would you like to add elements?");
            System.out.print("Element:");
            String element = in.next();
            list.add(element);
            System.out.println("Element " + element + " ' Successfully added");
            System.out.println("Would you like to add another one?" + "\nPress 1 for Yes \n Press 2 for No");
            int resp = in.nextInt();

            if (resp == 1) {
                repeat = true;
            } else if (resp == 2) {
                repeat = false;
            } else {
                System.out.println("Invalid Input. Please only enter 1 or 2");
                in.close();
                break;
            }
        }
    }

    public static void move() {
        System.out.println("Enter index you want to switch: ");
        int element1 = in.nextInt();
        System.out.println("Enter another index you want to switch: ");
        int element2 = in.nextInt();

        list.moveNodePointer(element1, element2);
        list.printlist();
    }

    public static void display() {
        list.printlist();
    }

    public static void delete() {
        System.out.println("Enter element you want to delete");
        list.printlist();
        String element = in.next();
        list.deleteByValue(element);
        System.out.println("Element ' " + element + " ' Successfully deleted!");
        System.out.print("list: ");
    }

    public static void main(String[] args) {

        System.out.println("You're here in the Simple LinkedList Program");
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Add Element");
            System.out.println("2. Move or switch Element");
            System.out.println("3. Display");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("--------------------------------");
            System.out.println();

            try {
                System.out.println("Response: ");
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        adding();
                        break;
                    case 2:
                        move();
                        break;
                    case 3:
                        display();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Thank You for Visiting");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid one");
                }
            } catch (Exception h) {
                System.out.println("Error 404:");
                break;
            }
        }
    }
}
