package LO3_arraylist;

import java.util.ArrayList;

public class ItemManager {

    private ArrayList<String> items;

    // Arraylist constructor
    public ItemManager() {
        items = new ArrayList<>();
    }

    // Method to display items
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }

    //Methods to add user's input
    public void addItems(String item1, String item2, String item3) {
        items.add(item1);
        items.add(item2);
        items.add(item3);
        System.out.println("You added: " + items);
    }

    //Updating one item in the list
    public void updateItem(int index, String newitem) {
        if (index >= 0 && index < items.size()) {
            String oldItem = items.set(index, newitem);
            System.out.println("You updated:" + oldItem + " to " + newitem);
        } else {
            System.out.println("Index out of bounds");
        }
    }
    //Finding item in the Arraylist
    public int finditem(String finditem){
        int index = items.indexOf(finditem);
        if(index != -1) {
           System.out.println("Found: " + finditem + " at index" + newitem);
        }else{  
            System.out.println(finditem + "not found");
        }
        return index;
}
}
