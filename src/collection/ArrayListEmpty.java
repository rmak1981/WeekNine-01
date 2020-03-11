package collection;

import java.util.*;
/*
Write a Java program to test an array list is empty or not.
 */
public class ArrayListEmpty {

        public static void main(String[] args)
        {
            // Create an empty ArrayList.
            ArrayList myArrayList = new ArrayList();

            // Test whether the array is empty or not.
            if (myArrayList.isEmpty())
            {
                System.out.println("The ArrayList is empty");//print string array is empty
            }
            else
            {
                System.out.println("The ArrayList is not empty");// print string array is not empty
            }
        }
    }


