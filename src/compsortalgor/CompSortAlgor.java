//    ,-~~-.___.            
//   / |  '     \         Final Project- Comparison of Sorting Algorithms
//  (  )        0                       CSCI 112 Fall 2015 
//   \_/-, ,----'                 Last edited December 1, 7:00 p.m.
//      ====           //                by Milton Murray
//     /  \-'~;    /~~~(O)
//    /  __/~|   /       |    
//  =(  _____| (_________|
package compsortalgor;

import static compsortalgor.mergSort.*;
import static compsortalgor.bubbleSort.*;
import static compsortalgor.quickSort.*;
import static compsortalgor.insSort.*;

import java.io.*;
import java.lang.*;
import java.util.*;



                 //▇ ▅ █ ▅ ▇ ▂ ▃ ▁ ▁ ▅ ▃ ▅ ▅ ▄ ▅ ▇\\
/**▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪
 * Your task here is to conduct benchmarking to compare the algorithms.  
 * You should try to run at least four of the five the sorting methods with random 
 * data sets of 10,000 20,000 100,000 200,000 1,000,000 and 2,000,000 items, 
 * 10 times each.
 * You should stop the program for the first trial of any sorting method that 
 * takes more than 15 minute to run and report this result.   
 * If a sorting algorithm takes too long for one trial, such as for 100,000 items,
 * then it is not necessary to complete the trials for larger data sets, simply 
 * report the size of the data set for which that algorithm started to take too 
 * long.
 * 
 * You should submit a report with your results and conclusions about the experiment.
 * Your report should describe how you conducted the experiment. Additionally, 
 * your report should include table containing data from an aspect of the overall 
 * research framework and data that you collected. Your report should also contain
 * a chart that visually explains your interpretation of the results that chart 
 * represents.Finally your report should summarize your findings
 * 
 * Upload the following
        Your Report as a Word Processing Document
        Any Code used to Create Data for the Report in a Zipped Container File
        PowerPoint Presentation
 * @author milto_000
▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫▪▪▫▫*/
                  //¸.ø¤°ˇ°·.¸ˇ°·.¸·=+"۵"+=·¸.·°ˇ¸.·°ˇ°¤ø.¸\\ 
public class CompSortAlgor {

    public static void main(String[] args) throws Exception {
        int size = 200_000;     // change this number to change the size of the random array
        int[] a = new int[size];
        int[] temp = new int[a.length];  // empty temporary array, the same size and type as a[]
         
        for (int k = 1; k<= 10; k++)
        {
            // fill the array with random integers
            for (int i = 0; i< a.length; i++) 
                a[i] = (int)(Math.random()*100_000 +1);


            // get the start time in nanoseconds
            long startTime = System.nanoTime();

            //call a Sorting algorithm to sort the entire array
            //mergeSort(a, temp, 0, (a.length - 1));
            //quickSort(a, 0, (a.length - 1));
            //insSort(a);
            //bubbleSort(a);
            
            // get the end time in nanoseconds
            long endTime = System.nanoTime();

            // calculate elapsed time in nanoseconds
            long duration = endTime - startTime;

            // print the elapsed time in seconds   (nanaoseconds/ 1 billion)
            System.out.printf("%12.8f %n", (double)duration/1_000_000_000) ;
            
        }
         
    }// end main()
    //**************************************************************************
//                              (╯°▫°)╯︵ ┻━┻
}
