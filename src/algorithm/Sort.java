package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        for(int i=1; i<list.length; i++){
            for(int j=i; j>0; j--){
                if(list[j]<list[j-1]){
                    int temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;


    }

    public int[] bubbleSort(int [] array){

        final long startTime = System.currentTimeMillis();
        int [] list = array;

        int n = list.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (list[i] > list[k]) {
                    swapNumbers(i, k, list);
                }
            }

        }
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }


    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public int [] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
      MergeSort objMS = new MergeSort();

        list = objMS.myMergeSort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }




    public int [] quickSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        QuickSort objQS = new QuickSort();
        objQS.myQuickSort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }







    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        HeapSort objHS = new HeapSort();
        list =  objHS.MyHeapSort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        int maxVal = list[0];
        //int maxVal=5;
        for(int i=1; i< list.length; i++)
        {
            if(list[i] > maxVal)
                maxVal = list[i];

        }

        sort(list,maxVal);
        return list;
    }


    // BUCKET SORT Function

    public static void sort(int[] a, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }
    }



    /* Shell Sort Program */

    public int [] shellSort(int [] array){

        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int i1, i, j, increment, temp, number_of_elements = list.length;

        for (increment = number_of_elements / 2; increment > 0; increment /= 2)
        {
            for (i = increment; i < number_of_elements; i++)
            {
                temp = list[i];
                for (j = i; j >= increment; j -= increment)
                {
                    if (temp < list[j - increment]) {
                        list[j] = list[j - increment];
                    } else {
                        break;
                    }
                }
                list[j] = temp;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    // Shell Sort



    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
