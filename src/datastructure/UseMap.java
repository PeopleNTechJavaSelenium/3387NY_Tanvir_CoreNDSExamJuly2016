package datastructure;

import DBConnection.ConnectDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> citiesOfUSA = new ArrayList<String>();
		citiesOfUSA.add("NY");
		citiesOfUSA.add("CO");
		citiesOfUSA.add("LA");

		List<String> citiesOfUK = new ArrayList<String>();
		citiesOfUK.add("London");
		citiesOfUK.add("Kent");
		citiesOfUK.add("Manchester");

		List<String> citiesOfBangladesh = new ArrayList<String>();
		citiesOfBangladesh.add("Dhaka");
		citiesOfBangladesh.add("Comilla");
		citiesOfBangladesh.add("Sylhet");


		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("USA", citiesOfUSA);
		map.put("UK", citiesOfUK);
		map.put("Bangladesh", citiesOfBangladesh);


		System.out.println(".......Retrieve the values by for each loop.......");
		for(Map.Entry<String, List<String>> entry:map.entrySet()){
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}

		System.out.println(".......Retrieve the values by Iterator and While loop.......");
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry data = (Map.Entry)it.next();
			System.out.println(data.getKey() + " " + data.getValue());
		}

// Store DATA into MySQL DATABASE  and Retrive the data from DaTA Base

		 ConnectDB connectDB = new ConnectDB();
        // connectDB.InsertDataFromMapList(map,"tbl_map_data","MapKey","MapValue");



        // Read Execution Time for Insertion Short
        List<String> mapDataFromDB = new ArrayList<String>();
        try {
            mapDataFromDB = connectDB.directDatabaseQueryExecute("select CONCAT_WS(' ',MapKey,MapValue) as MapDATA from tbl_map_data ORDER BY MapKey","MapDATA");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Retrieving MAP Data From MySQl Database");

        for(String st:mapDataFromDB){

            System.out.println(st);
        }


	}

}
