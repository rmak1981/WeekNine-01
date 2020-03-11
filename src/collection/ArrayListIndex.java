package collection;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */
import java.util.*;

public class ArrayListIndex {
        public static void main(String[] args) {
            // Creae a list and add some colors to the list
            List<String> list_Strings = new ArrayList<String>();
            list_Strings.add("Red");// array index 0
            list_Strings.add("Green");// array index 1
            list_Strings.add("Orange");// array index 2
            list_Strings.add("White");// array index 3
            list_Strings.add("Black");// array index 4
            // Print the list
            System.out.println(list_Strings);
            // Retrive the first and third element
            String element = list_Strings.get(0);
            System.out.println("First element: "+element);
            element = list_Strings.get(2);
            System.out.println("Third element: "+element);
        }
    }


