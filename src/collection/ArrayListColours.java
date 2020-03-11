package collection;
/*
Write a Java program to create a new array list, add some colours (string) and printout the collection
 */
import java.util.*;

public class ArrayListColours {
    // main method
        public static void main(String[] args) {
            List<String> list_Strings = new ArrayList<String>();// list of colour array is below
            list_Strings.add("Red");// array index 0
            list_Strings.add("Green");// array index 1
            list_Strings.add("Orange");// array index 2
            list_Strings.add("White"); // array index 3
            list_Strings.add("Black"); //  array index 4
            System.out.println(list_Strings); // print list of array strings
        }

    }



