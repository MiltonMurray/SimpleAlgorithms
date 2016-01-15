/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compsortalgor;

/**
 *
 * @author milto_000
 */
public class bubbleSort extends CompSortAlgor{

    /**
     *
     * @param a
     */
    public static void bubbleSort(int[] a)
    {
        boolean swapped;    // a boolean variable to keep track of when array values are swapped 
        int i;              // used as aloop counter
        int c;           // a catalyst variable for swapping values of variables

        do     //the outer post-test loop will  repeat another pass through the list when swapped in true
    { 
         swapped = false;   	
         for( i=0; i < (a.length - 1) ; i++)    // a pass through the array to the second to last element
         {
            if ( a[i+1]-a[i] < 0 )	     // if the two items are out of order
            {
                // swap the two itemes and set swapped to true 
                c = a[i];   
                a[i] = a[i+1];
                a[i+1] = c;
                swapped = true;
            }  // end if

    } // end for
    } while (swapped);	// the outer loop will repeat if swapped is true – another pass





    }// end sortCities()
    /****************************************************************************/
    
}
