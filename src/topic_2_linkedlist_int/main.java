package topic_2_linkedlist_int;

import java.util.Scanner;

public class main {

    public static LinkedList list = new LinkedList();
    public static Scanner in = new Scanner(System.in);

    //This is a block of methods
    public static void adding() {
        boolean repeat = true;

        while (repeat) {
            System.out.println("What Integer do you like to add?");
            System.out.print("Integer: ");
            int element = in.nextInt();
            list.add(element);
            System.out.println("Integer ' " + element + " '  successfully added");
            System.out.println("Would you like to add more?" + "\nPress 1 for YES \nPress 2 for NO");
            int resp = in.nextInt();

            if (resp == 1) {
                repeat = true;
            } else if (resp == 2) {
                repeat = false;
            } else {
                System.out.println("Invalid input. Please enter 1 or 2.");
                in.close();
                break;
            }
        }
    }

    public static void move() {
        System.out.println("Enter index you want to switch: ");
        int element1 = in.nextInt();
        System.out.println("Enter index you want to switch: ");
        int element2 = in.nextInt();

        list.moveNodePointer(element1, element2);
        list.printList();
    }

    public static void display() {
        list.printList();
    }

    public static void delete() {
        System.out.println("What Integer would you like to delete?");
        list.printList();
        int element = in.nextInt();
        list.deleteByValue(element);
        System.out.println("Integer '" + element + "' successfully deleted!");
        System.out.print("List: ");
        list.printList();
    }

    public static void main(String[] args) {

        //Displaying Menu Choices
        System.out.println("You're Here at Linkedlist Program!");
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("-----------------------");
            System.out.println("1. Add Integer");
            System.out.println("2. Move or Swap Integer");
            System.out.println("3. Display");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("-----------------------");
            System.out.println();

            try {
                System.out.print("Response: ");
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
                        System.out.println("Thank you for using Simple Linkedlist Program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (Exception e) {
                System.out.println("Error 404. Input Invalid");
                break;
            }

        }
    }

}
