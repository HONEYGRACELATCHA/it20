package topic_3_stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack st = new Stack(5);

        while (true) {
            System.out.println("------------------");
            System.out.println("Choose number you want to perform"
                    + "\n1. Stack size"
                    + "\n2. Push number"
                    + "\n3. Peek top Element"
                    + "\n4. Pop top Element"
                    + "\n5. Exit");
            System.out.println("================");
            try {

                System.out.print("Response: ");

                int choice = in.nextInt();
                System.out.println();
                switch (choice) {
                    case 1:
                        System.out.println("Stack size is: " + st.size());
                        System.out.println("---------------------");
                        break;
                    case 2:
                        System.out.println("Push Element: ");
                        int num = in.nextInt();
                        st.push(num);
                        System.out.println("---------------------");
                        break;
                    case 3:
                        System.out.println("The top Element is: " + st.peek());
                        break;
                    default:
                        System.out.println("Invalid input.");
                }

            } catch (Exception e) {
                System.out.println("Input is not a valid. Please try again!");
                in.next();
            }
        }
    }

}
