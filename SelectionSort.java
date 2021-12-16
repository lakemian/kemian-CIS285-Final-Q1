
public class SelectionSort {

    /* Selection Sort function */

public static void sort( int arr[] ){

   int N = arr.length;

   int i, j=0, pos=0, temp;

   for (i = 0; i < N; i++)
   {
       for (j = i+1; j < N; j++)
       {
    	   pos = j;
           if (arr[i] > arr[pos])
           {
               pos = i;
           }
           /* Swap arr[i] and arr[pos] */

           temp = arr[j];

           arr[j] = arr[pos];

           arr[pos]= temp;

       }



   }

 }

}
