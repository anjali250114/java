import java.util.*;
//generic class StorageRoom
public class StorageRoom<T> {
   private T t;
//method for generic class
   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {

      StorageRoom<Integer> integerBox = new StorageRoom<Integer>();
      StorageRoom<String> stringBox = new StorageRoom<String>();
      //Creating instances of the arraylist in collections
      List<String> items=new ArrayList<String>();
      //adding the elements into the items
      items.add("Pen");
      items.add("Deodrants");
      items.add("Coffee");
      items.add("Tea");
      items.add("Shampoos");
      items.add("Soap");
      items.add("Conditioner");
      items.add("Bags");
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Value Cart Storage Room"));

      
      System.out.printf("Name of the Storage Room :%s\n", stringBox.get());
      System.out.printf("Total no. of Stores :%d\n\n", integerBox.get());
      System.out.println("Each of store contains the following items: ");
      for(String item: items){
        System.out.println(item);
      }
   }
}