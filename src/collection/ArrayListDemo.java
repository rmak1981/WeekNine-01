package collection;
/*
Write a Java program to reverse an array of integer values.

reverse integer of array is below created my self .. using for loop

*/
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList Declaration
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);// array index 0
        list.add(20);// array index 1
        list.add(30);// array index 2
        list.add(40);// array index 3
        //int a = 10;
       // System.out.println(list.get(0));
        //System.out.println(list.size());

        // Iterating the list for loop
        //i= arr.length-1; i>=0; i--
        //i = -1; i<list.size(); i++){

      for(int i= list.size()-1; i>=0; i--){
           System.out.println(list.get(i));
        }
//       for ( int data: list){
//            System.out.println(data);
//        }

    }
}
