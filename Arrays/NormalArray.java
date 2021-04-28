//importing arrays and collections class
import java.util.Arrays;
import java.util.Collections;

public class NormalArray {
    public static void main(String[] args) {

    
    //initializing array and printing out current list
    String[] shoppingList = {"Apples", "Bacon", "Bread", "Cheese", "Cereal"};
    System.out.println(Arrays.toString(shoppingList) );
    
    //copying the array shoppingList and increasing the size by 1 so we can add an element to the end
    shoppingList = Arrays.copyOf(shoppingList, shoppingList.length + 1);
    
    shoppingList[shoppingList.length - 1] = "Ham";
    System.out.println(Arrays.toString(shoppingList) );
    
    
    
    }
}
