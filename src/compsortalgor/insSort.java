/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compsortalgor;

import java.io.*;
import java.lang.*;
import java.util.*;

/**
 *
 * @author milto_000
 */
public class insSort extends CompSortAlgor {
    public static void insSort(int[] studentB) throws Exception{
        
        int value;   // the next value from the unsorted list to be inserted into the sorted list
        int i;          // i is a pointer to an item in the unsorted list
        int j;          // j is a pointer to an item in the sorted list; originally the sorted list is just a[0]
        
  
  
        for (i = 1; i < studentB.length; i++) { //the condition has changed
            value = studentB[i];        // the next item from the original list, which will be added to the new list
            j = i - 1;                  // set the pointer to the beginning of the unsorted list. We will work down (left) from here
            
            while (j >= 0 && studentB[j]>value ) {
                studentB[j + 1] = studentB[j];//move the current item to the right; this is not the insertion spot yet
                j--;    // go left to the next item in the array
            }//end while -- the loop continues, moving each array element to the right
             // until the spot for insertion is reached
            
        studentB[j + 1] = value;    //insert value in the correct spot.
                                    // We add one because the empty correct spot is after this item
        }//end for -- Process the next item from the original list each time through the loop.
  
      
    }//end insSOrt()   
}
