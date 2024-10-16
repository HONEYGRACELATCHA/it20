package topic_4_queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();

        System.out.println("Welcome to Simple Queue Program!");
        System.out.println();

        while (true) {
            System.out.println("Choose an Option to Perform"
                    + "\n1. Add Customer"
                    + "\n2. Serve Customer"
                    + "\n3. Display Queue"
                    + "\n4. Exit");

            System.out.println();

            try {

                System.out.print("Choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Customer name: ");
                        String name = sc.next();
                        q.enqueue(new Customer(name));
                        break;
                    case 2:
                        q.deQueue();
                        break;
                    case 3:
                        q.displayQueue();
                        break;
                    case 4:
                        System.out.println("Thannk You for running this simple program!");
                        sc.close();
                        break;
                    default:
                        System.out.println("Invalid input. Please try Again!");
                }

            } catch (Exception e) {
                System.out.println("Input is not a valid.");
                sc.next();

            }
        }

    }
}
