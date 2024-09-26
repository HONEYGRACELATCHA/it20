package topic_2_linkedlist_int;

import java.util.Scanner;

public class main {

    public static LinkedList list = new LinkedList();
    public static Scanner sc = new Scanner(System.in);

    //This is a block of methods
    public static void adding() {
        boolean repeat = true;
          
        while (repeat) {
            System.out.println("What Integer do you like to add?");
            System.out.print("Integer: ");
            int element = sc.nextInt();
            list.add(element);
            System.out.println("Integer ' " + element + " '  successfully added");
            System.out.println("Would you like to add more?" + "\nPress 1 for YES \nPress 2 for NO");
            int resp = sc.nextInt();

            if (resp == 1) {
                repeat = true;
            } else if (resp == 2) {
                repeat = false;
            } else {
                System.out.println("Invalid input. Please enter 1 or 2.");
                sc.close();
                break;
            }

        }

    }
    }
    

