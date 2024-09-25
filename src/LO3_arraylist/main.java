package LO3_arraylist;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ItemManager list = new ItemManager();

//Initialize Variables
        String item1, item2, item3, newitem, finditem;
        int index;

        //Displaying items
        list.displayItems();
        
        //user input
        System.out.println("Enter 3 items to add: ");
        item1 = in.nextLine();
        item2 = in.nextLine();
        item3 = in.nextLine();


    }
}
