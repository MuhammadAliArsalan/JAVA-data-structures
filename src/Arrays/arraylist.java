import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(80);
        list.add(120);
        list.add(150);
        
        //adding elemnts in arrayList using for loop
        int [] arr={10,20,30,40,50};

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }


        //printing list using for loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //FOR EACH LOOP
        System.out.println("\n "+"FOR EACH LOOP");
        for(int num:list){
            System.out.println(num);
        }

        System.out.println("The size of list is "+list.size());
        System.out.println(list);   //[80, 120, 150]
        
        //check whether list contains an elemnt or not

        Boolean doesConrain=list.contains(140);
        System.out.println(doesConrain); // false


        //reomve an element

        list.remove(2);

        //printing list after removing
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        /*80       //150 has been reoved
        120
        10
        20
        30
        40
        50 */

        list.add(3,180);
         
        System.out.println("After adding 180 at index 3"); //adding 180 at index 3
        //printing list after adding 180 at index 3
        for(int x:list){
            System.out.println(x);
        }
        
        list.set(6,120);    //setting 120 at index 6
        System.out.println("After setting 120 at index 6"); //setting 120 at index 6

        for(int num:list){
            System.out.println(num);   //prevously we had 40 at index 6, now we have 120
        } 

        //replaceAll

        list.replaceAll((n->n*100));

        for(int x:list){
            System.out.println(x);   //all the elements are multiplied by 100
        }
        /*8000
        12000
        1000
        18000
        2000
        3000
        12000
        5000 */

        //
        List<String> Cars=new ArrayList<>();

        String[] cars={"Mazda","Honda","Toyota","suzuki"};
        System.out.println(Cars.getClass().getName());  //java.util.ArrayList

        for(int i=0;i<cars.length;i++){
            Cars.add(cars[i]);
        }
        System.out.println(Cars);
        

        //This creates a fixed-size list (java.util.Arrays$ArrayList) backed by an array.
        List<String> list1= Arrays.asList("wednesday","monday","Tuesday","friday");
        System.out.println(list1.getClass().getName());  //java.util.Arrays$ArrayList
        System.out.println(list1.get(3));   //18000
        

        //only these 2 methods work on list1
        list1.get(2);
        list1.set(2,"thursday"); // now at index 2 , thursday will appear instead of tuesday
        
        System.out.print("\n------------\n");
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        String[] array={"apple","mango","peach"};
        List<String> list2=new ArrayList<>(Arrays.asList(array));    //modifibale list 

        System.out.println(list2.getClass().getName());  //java.util.Arrays$ArrayList

        String[] fruits2={"papaya","pineapple","strawberry"};
        for(int i=0;i<fruits2.length;i++){
            list2.add(fruits2[i]);
        }

        System.out.println(list2);  //[apple, mango, peach, papaya, pineapple, strawberry]

        Cars.addAll(list2);
        System.out.println(Cars);   // [Mazda, Honda, Toyota, suzuki, apple, mango, peach, papaya, pineapple, strawberry]

    }
}
