package math;

import DBConnection.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		List<Object> list = new ArrayList<Object>();
		int limit = 1000000, counter =0;
		for(int i=2; i<limit; i++){
			if(isPrime(i)){

				list.add(i);
				//System.out.println(i);


				counter++;
			}
		}

		System.out.println("Number of prime numbers: " + counter);

		ConnectDB connectDB = new ConnectDB();
		// Insert into Database from Array List

		connectDB.InsertDataFromArryListToMySql(list,"tbl_primenumber","PNumbers");

		// Read from Database

		// DATA READ FROM DATABASE
		List<String> listPattern = new ArrayList<String>();
		try {
			listPattern = connectDB.readDataBase("tbl_primenumber", "PNumbers");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:listPattern){
			System.out.println(st);
		}

	}

	public static boolean isPrime(int num){
		for(int j=2; j<num; j++){
			if(num % j == 0){
				return false;
			}
		}
		return true;
	}

}
