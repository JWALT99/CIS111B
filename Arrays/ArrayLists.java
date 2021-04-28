import java.util.ArrayList;

public class ArrayLists {
  public static void main(String args[]) {
    ArrayList<String> shopList = new ArrayList<String>();

    //adding elements in to the list
    shopList.add("Apples");
    shopList.add("Bacon");
    shopList.add("Water");
    shopList.add("Bread");
    shopList.add("Eggs");
    shopList.add("Cheese");
    shopList.add("Soup");
    shopList.add("Bagels");
    
    //adding some elements to the middle of the list
    shopList.add(3, "Ham");
    shopList.add(3, "Turkey");
    
    //adding some elements to the beginning of the list
    shopList.add(0, "Milk");
    shopList.add(0, "Cheerios");
    
    //printing out the list
    System.out.println("Shopping List: " + shopList);
    System.out.println("Size of shopping list before removing items: " + shopList.size());

    //removing some items from the list
    shopList.remove("Apples");
    shopList.remove("Soup");
    
    //printing out the size of the shopping list after removing items and the final list of items
    System.out.println("Shopping list: " + shopList);
    System.out.println("Size of shoppinglist after removing items: " + shopList.size());
    
    /**No need to double the size of the list because with each element added, the array 
     * automatically increases in size .
     */
  }
}           
