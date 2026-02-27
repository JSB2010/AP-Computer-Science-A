package Week19;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPrograms
{
  public static ArrayList<String> storeMethod()
  {
   //StoreMethod: Write a method that asks the user how many names (Strings) they would like to enter.
   //Using an ArrayList, store the names.
   //return the ArrayList you just created
      System.out.print("Please enter the number of phone numbers you want to store: ");
      Scanner input = new Scanner(System.in);
      int numName = input.nextInt();
      ArrayList<String> names = new ArrayList<>();
      for(int i = 0; i < numName; i++){
          System.out.print("Please enter next name: ");
          Scanner in = new Scanner(System.in);
          String name = in.next();
          names.add(name);
      }
      return names;
  }
  public static ArrayList<String> sortMethod(ArrayList<String> list)
  {
      //SortMethod: Write a method that receives an ArrayList of Strings
      //and sorts them into alphabetical order.
      //DO NOT use Collection.sort!
      //return the sorted ArrayList

      for (int i = 1; i < list.size(); i++) {
          String key = list.get(i);
          int j = i - 1;
          while (j >= 0 && list.get(j).compareTo(key) > 0) {
              list.set(j + 1, list.get(j));
              j--;
          }
          list.set(j + 1, key);
      }
      return list;
  }                   

  public static ArrayList<String> addStringMethod(ArrayList<String> list, String item)
  {
      //AddStringMethod: Write a method that receives an ArrayList of Strings and another String
            //and adds that new string into the list in alphabetical order.
      //DO NOT use Collection.sort!
      //return the sorted ArrayList with the new name added in the correct place
      list.add(item);
      sortMethod(list);
      return list;
  }
   
  public static ArrayList<String> removeStringMethod(ArrayList<String> list, String item)
  {
    //RemoveStringMethod: Write a method that receives an ArrayList of Strings and another String
        //and removes ALL occurrences of the String from the ArrayList.

      for(int i = 0; i < list.size(); i++){
          if(list.get(i).equals(item)){
              list.remove(i);
          }
      }

      return list;
  }
    
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        //test method 1
        ArrayList<String> names = storeMethod();
        System.out.println(names);
        
        //test method 2
        names = sortMethod(names);
        System.out.println(names);
        
        //test method 3
        String newName;
        System.out.print("Enter a new name to add to the list: ");
        newName = reader.nextLine();
        
        names = addStringMethod(names, newName);
        System.out.println(names);
        
        //test method 4
        //make sure that if there are 2 (or more) identical items in your list, that both are removed
        //in the remove method
        System.out.print("Enter a name to be removed from the list: ");
        newName = reader.nextLine();
        
        names = removeStringMethod(names, newName);
        System.out.println(names);
    }
}
   
