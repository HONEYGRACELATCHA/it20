package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {

    public static LinkedList list = new LinkedList();
    public static Scanner in = new Scanner(System.in);
    
    public static void adding(){
        boolean repeat = true;
        
        while(repeat) {
            System.out.println("Would you like to add elements?");
            System.out.print("Element:");
            String element = in.next();
            list.add(element);
            System.out.println("Element " + element + " ' Successfully added");
            System.out.println("Would you like to add another one?" + "\nPress 1 for Yes \n Press 2 for No");
            int resp = in.nextInt();
            
            if(resp == 1) {
                repeat = true;
            } else if(resp == 2) {
                repeat = false;
            } else {
                System.out.println("Invalid Input. Please only enter 1 or 2");
                in.close();
                break;
            }
        }
    }
}
        
    
    
   
           






        

    

   

