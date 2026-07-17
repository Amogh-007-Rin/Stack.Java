import java.util.*;

public class ClassWork {
    
    public static void main(String args[]){
      
      // Consise way of making a list item
      List<String> foods = new ArrayList<String>(Arrays.asList("mango", "apple", "jackfruit")); // foods is now an object of list
      // Consise way of iterating over a list
      for(String food : foods){
        System.out.println(food);
      }
      // syntex 2 - > arrays
      int score[] = {1,2,3,4,4,5,6,5,4,45,33,34,55,22};
      for (int runs : score){
        System.out.println(runs);
      }
      // Map
      Map<String, String> phoneNumbers = new HashMap<>(); // phonenumber is now an object of Map
      // Map< Key, Value > -> map will store the values in a key:value pair -> like a dict in python
      // consise way to place all the values inside a Mapobject as a key value pair ->

      phoneNumbers.putAll(Map.of(
        "amogh", "99388300838",
        "param" , "993838920",
        "akash" , "773989299"
      ));

      phoneNumbers.forEach((name, number) -> {
        System.out.println("Name : " + name + " Number : " + number);
    });
     
    String weekdays[] = {"A", "B", "D", "C", "F", "E", "H", "I", "K", "J"};
        
    System.out.println("Before using the array methods");
        for(int i=0; i<weekdays.length; i++){
            System.out.println(weekdays[i]);
        }

        for(String days : weekdays){
           System.out.print(days + " is a day of the weekdays");
         }
        System.out.println("After using sort methods over strings");

        Arrays.sort(weekdays);// This arrays methods sorts the strings into order of A -> Z
        for(int i=0; i<weekdays.length; i++){
            System.out.println(weekdays[i]);
        }

        System.out.println("After using the toString method over an array");
        
        Arrays.fill(weekdays, "A"); // This fills all the values of the array with the filling value i.e A here
        for(int i=0; i<weekdays.length; i++){
            System.out.println(weekdays[i]);
        }

    }
}
