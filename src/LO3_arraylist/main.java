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

        //inputs that will be added to the arraylist
        list.addItems(item1, item2, item3);
        System.out.println(" ------------------------------");

        //Updating one value
        System.out.print("Enter an index number that you want to change: ");
        index = in.nextInt();
        in.nextLine();
        System.out.println("Enter a new item that you want to replace with the other index");
        newitem = in.nextLine();
        list.updateItem(index, newitem);
        list.displayItems();
        System.out.println("------------------------------------");
        
        //Finding user's input and displaying it
        System.out.println("Enter an item name that you want to find: ");
        finditem = in. nextLine();
        list.finditem(finditem);
        list.displayItems();
        System.out.print("-------------------------------------");
    }
}
