package reader;

import DBConnection.ConnectDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);
			String text = "";

			String MyString = "";

			while((text = br.readLine())!= null){
				//System.out.println(text);
				MyString = MyString+"\n"+text;
			}


		ConnectDB connectDB = new ConnectDB();
			// Insert into Database from Array List

			//connectDB.InsertDataFromArryListToMySql(list,"tbl_pattern","PatternNumbers");
           connectDB.InsertDataFromStringToMySql(MyString,"tbl_datareader","TextData");
			// Read from Database

			// DATA READ FROM DATABASE
			List<String> listPattern = new ArrayList<String>();
			try {
				listPattern = connectDB.readDataBase("tbl_datareader", "TextData");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Data is reading from the Table (tbl_datareader) and displaying to the console");
			for(String st:listPattern){
				System.out.println(st);
			}

		//	System.out.println(MyString);

		}catch(Exception ex){
			System.out.println("Hey ! file is not found. fix the path");
		}finally{
			fr.close();
			br.close();
		}

	
	}

}
