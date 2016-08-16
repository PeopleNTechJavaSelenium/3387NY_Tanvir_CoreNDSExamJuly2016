package math;

import DBConnection.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		List<Object> list = new ArrayList<Object>();

		int j =0;
		int k=0;

		for(int i=100; i>0;i--)
        {
       int p = i-j;
		   i=p;
			list.add(p);
		 if(k==10)
		 {
			 j++;
			 k=0;
		 }
		  k++;
	  }


		ConnectDB connectDB = new ConnectDB();
      // Insert into Database from Array List

		connectDB.InsertDataFromArryListToMySql(list,"tbl_pattern","PatternNumbers");

        // Read from Database

        // DATA READ FROM DATABASE
        List<String> listPattern = new ArrayList<String>();
        try {
            listPattern = connectDB.readDataBase("tbl_pattern", "PatternNumbers");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Data is reading from the Table (tbl_pattern) and displaying to the console");
        for(String st:listPattern){
            System.out.println(st);
        }

	}
}
