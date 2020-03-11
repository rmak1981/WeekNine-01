package collection;
import java.util.*;

public class ArrayListIterate {
        public static void main(String[] args) {
            // Creae a list and add some colors to the list
            List<String> list_Strings = new ArrayList<String>();
            list_Strings.add("Red");// array index 0
            list_Strings.add("Green");// array index 1
            list_Strings.add("Orange");// array index 2
            list_Strings.add("White");// array index 3
            list_Strings.add("Black");// array index 4
            // Print the list of array string s
            for (String element : list_Strings) {
                System.out.println(element);
            }
        }
    }


