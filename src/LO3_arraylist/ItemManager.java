
package LO3_arraylist;
import java.util.ArrayList;


public class ItemManager {
    
    private ArrayList<String> items;
    
    // Arraylist constructor
    public ItemManager() {
        items = new ArrayList<>() ;
    }
    // Method to display items
    
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }
}
