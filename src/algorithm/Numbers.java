package algorithm;

import DBConnection.ConnectDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) {
		
		int [] num = new int[10000];
		
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			
		num[i] = rand.nextInt(100000);
           // num[i] = rand.nextInt(1000000);
		}
		ConnectDB connectDB = new ConnectDB();
        //connectDB

		//Selection Sort
		Sort algo = new Sort();


	/*	algo.selectionSort(num);
	   //long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
*/




		//Insertion Sort
        // FUNCTION CALL FOR SORTING THE DATA AND INSERT INTO DATABASE
        connectDB.InsertDataFromArryToMySql(algo.insertionSort(num),"tbl_insertionSort","SortingNumbers");

        // DATA READ FROM DATABASE
        List<String> listInsSort = new ArrayList<String>();
        try {
            listInsSort = connectDB.readDataBase("tbl_insertionSort", "SortingNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:listInsSort){
            System.out.println(st);
        }

		long insertionSortExecutionTime = algo.executionTime;
       connectDB.InsertDataFromStringToMySql(Long.toString(insertionSortExecutionTime),"tbl_insertionSort","ExecutionTime");

       // Read Execution Time for Insertion Short
        List<String> listInsSortEXT = new ArrayList<String>();
        try {
            listInsSortEXT = connectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_insertionsort ORDER BY ID DESC limit 0,1", "ExecutionTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sort Execution Time");

        for(String st:listInsSortEXT){
            System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + st + " milli sec");
        }



//  BABBLE SORT
// FUNCTION CALL FOR SORTING THE DATA AND INSERT INTO DATABAS
      connectDB.InsertDataFromArryToMySql(algo.bubbleSort(num),"tbl_bubblesort","SortingNumbers");

        List<String> bubbleSort = new ArrayList<String>();
        try {
            bubbleSort = connectDB.readDataBase("tbl_bubblesort", "SortingNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:bubbleSort){
            System.out.println(st);
        }

        long bubbleSortTime = algo.executionTime;

        connectDB.InsertDataFromStringToMySql(Long.toString(bubbleSortTime),"tbl_bubblesort","ExecutionTime");

        // Read Execution Time for Insertion Short
        List<String> bubbleSortEXT = new ArrayList<String>();
        try {
            bubbleSortEXT = connectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_bubblesort ORDER BY ID DESC limit 0,1", "ExecutionTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sort Execution Time");

        for(String st:bubbleSortEXT){
            System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in bubble Sort take: " + st + " milli sec");
        }


//  Merge SORT
// FUNCTION CALL FOR SORTING THE DATA AND INSERT INTO DATABAS

        connectDB.InsertDataFromArryToMySql(algo.mergeSort(num),"tbl_mergeSort","SortingNumbers");

        List<String> mergeSort = new ArrayList<String>();
        try {
            mergeSort = connectDB.readDataBase("tbl_mergeSort", "SortingNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:mergeSort){
            System.out.println(st);
        }

       long mergeSortTime = algo.executionTime;

       connectDB.InsertDataFromStringToMySql(Long.toString(mergeSortTime),"tbl_mergeSort","ExecutionTime");

        // Read Execution Time for Insertion Short
        List<String> mergeSortEXT = new ArrayList<String>();
        try {
            mergeSortEXT = connectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_mergeSort ORDER BY ID DESC limit 0,1", "ExecutionTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sort Execution Time");

        for(String st:mergeSortEXT){
            System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in mergeSort Sort take: " + st + " milli sec");
        }



        connectDB.InsertDataFromArryToMySql(algo.quickSort(num),"tbl_quicksort","SortingNumbers");

        List<String> quicksort = new ArrayList<String>();
        try {
            quicksort = connectDB.readDataBase("tbl_quicksort", "SortingNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:quicksort){
            System.out.println(st);
        }

        long quicksortTime = algo.executionTime;

        connectDB.InsertDataFromStringToMySql(Long.toString(quicksortTime),"tbl_quicksort","ExecutionTime");

        // Read Execution Time for Insertion Short
        List<String> quickSortEXT = new ArrayList<String>();
        try {
            quickSortEXT = connectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_quicksort ORDER BY ID DESC limit 0,1", "ExecutionTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sort Execution Time");

        for(String st:quickSortEXT){
            System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in quicksort take: " + st + " milli sec");
        }




        connectDB.InsertDataFromArryToMySql(algo.heapSort(num),"tbl_heapsort","SortingNumbers");

        List<String> heapsort = new ArrayList<String>();
        try {
            heapsort = connectDB.readDataBase("tbl_heapsort", "SortingNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:heapsort){
            System.out.println(st);
        }

        long heapsorttime = algo.executionTime;

        connectDB.InsertDataFromStringToMySql(Long.toString(heapsorttime),"tbl_heapsort","ExecutionTime");

        // Read Execution Time for Insertion Short
        List<String> heapsortEXT = new ArrayList<String>();
        try {
            heapsortEXT = connectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_heapsort ORDER BY ID DESC limit 0,1", "ExecutionTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sort Execution Time");

        for(String st:heapsortEXT){
            System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in heapsort Sort take: " + st + " milli sec");
        }




        //tbl_bucketsort


        connectDB.InsertDataFromArryToMySql(algo.bucketSort(num),"tbl_bucketsort","SortingNumbers");

        List<String> bucketsort = new ArrayList<String>();
        try {
            bucketsort = connectDB.readDataBase("tbl_bucketsort", "SortingNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:bucketsort){
            System.out.println(st);
        }

        long bucketsortTime = algo.executionTime;

        connectDB.InsertDataFromStringToMySql(Long.toString(bucketsortTime),"tbl_bucketsort","ExecutionTime");

        // Read Execution Time for Insertion Short
        List<String> bucketSortEXT = new ArrayList<String>();
        try {
            bucketSortEXT = connectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_bucketsort ORDER BY ID DESC limit 0,1", "ExecutionTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sort Execution Time");

        for(String st:bucketSortEXT){
            System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in bucketSort take: " + st + " milli sec");
        }


        connectDB.InsertDataFromArryToMySql(algo.shellSort(num),"tbl_shellSort","SortingNumbers");

        List<String> shellSort = new ArrayList<String>();
        try {
            shellSort = connectDB.readDataBase("tbl_shellSort", "SortingNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table and displaying to the console");
        for(String st:shellSort){
            System.out.println(st);
        }

        long shellSortTime = algo.executionTime;

        connectDB.InsertDataFromStringToMySql(Long.toString(shellSortTime),"tbl_shellSort","ExecutionTime");

        // Read Execution Time for Insertion Short
        List<String> shellSortTimeEXT= new ArrayList<String>();
        try {
            shellSortTimeEXT = connectDB.directDatabaseQueryExecute("select ExecutionTime from tbl_shellSort ORDER BY ID DESC limit 0,1", "ExecutionTime");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sort Execution Time");

        for(String st:shellSortTimeEXT){
            System.out.println(" Read from MySQL DB: Total Execution Time of " + num.length + " numbers in shellSort take: " + st + " milli sec");
        }

    }



	public static void MySqlInsertFromArray(int [] InsData,String tableName)
	{
		for(int n=0; n<InsData.length; n++){


			System.out.println(InsData[n]);
		}

	}

}
