package algorithm;

/**
 * Created by rinko on 8/14/2016.
 */
public class QuickSort {


    public int []  myQuickSort(int[] myData) {

        int[] a = myData;

        quickSort(a, 0, a.length - 1);
       // System.out.println(a);
      //  ArrayList al = new ArrayList();
        return a;
    }




    public static void quickSort(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q=partition(a,p,r);
            quickSort(a,p,q);
            quickSort(a,q+1,r);
        }
    }

    private static int partition(int[] a, int p, int r) {

        int x = a[p];
        int i = p-1 ;
        int j = r+1 ;

        while (true) {
            i++;
            while ( i< r && a[i] < x)
                i++;
            j--;
            while (j>p && a[j] > x)
                j--;

            if (i < j)
                swap(a, i, j);
            else
                return j;
        }
    }

    private static void swap(int[] a, int i, int j) {
        // TODO Auto-generated method stub
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }






}
