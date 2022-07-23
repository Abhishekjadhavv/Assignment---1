// java Program to copy all elements of one array into another array
// ARRAY 1  
// 1   2  3  4  5   
// ARRAY 2  
// 1   2  3  4  5  

// import java.util.*;
public class Array1
{
    public static void main(String [] args)
    {
        int arr[] = {1,2,3,4,5};
        int arr1[] = new int[arr.length];
        int j = 0;
        for (int i : arr) {
            arr1[j++] = i;
        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}