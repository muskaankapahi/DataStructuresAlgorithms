// Java program to remove duplicates
// from unsorted array

import java.util.*;

class RemoveDuplicatesUsingSet {

    // Function to remove duplicate from array
    public static void removeDuplicates(List <Integer> arr)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
//        for (int i = 0; i < arr.length; i++) //used for arrays
//            set.add(arr[i]);
        set.addAll(arr); //used for lists

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    // Driver code
    public static void main(String[] args)
    {
//        int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
        List<Integer> arr = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6);


        // Function call
        removeDuplicates(arr);
    }
}
