package collection;
/*
reverse array programme
 */
import java.util.Arrays;

public class ArrayListReverse {

        public static void main(String[] args){
            int[] my_array1 = {
                    9, 8, 7, 6, 5,
                    5, 4, 3, 2, 1, 0};
            System.out.println("Original array : "+Arrays.toString(my_array1));
            for(int i = 0; i < my_array1.length / 2; i++)
            {
                int temp = my_array1[i];
                my_array1[i] = my_array1[my_array1.length - i - 1];
                my_array1[my_array1.length - i - 1] = temp;
            }
            System.out.println("Reverse array : "+Arrays.toString(my_array1));
        }
    }

