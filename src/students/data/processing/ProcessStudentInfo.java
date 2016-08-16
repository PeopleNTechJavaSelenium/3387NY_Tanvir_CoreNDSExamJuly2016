package students.data.processing;

import DBConnection.ConnectDB;
import org.xml.sax.SAXException;
import xml.parser.Student;
import xml.parser.XmlReader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.
		 * 
		 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map. 
		 * Once map has all data, retrieve those data and out put to console.
		 *
		 * Do any necessary steps that require for below successful output.
		 * .................................................
		 * Student (id= 1) "Marc" "Carp"       Grade= B
		 * Student (id= 2) "Israt" "Khan"      Grade= A
		 * Student (id= 3) "Mohi" "Uddin"      Grade= A
		 * Student (id= 4) "Abrar" "Hossain"   Grade= B
		 * Student (id= 5) "Abida" "Sultana"   Grade= C
		 * .................................................
		 * 
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and to retrieve data.
		 *
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				//Path of XML data to be read.
				String pathSelenium  = System.getProperty("user.dir") +"\\src\\xml\\parser\\selenium.xml"; ;//"C:\\Users\\rinko\\IdeaProjects\\CoreNDSExamJuly2016\\CoreNDSExamJuly2016\\src\\xml\\parser\\selenium.xml";//System.getProperty("user.dir") +"/src/xml/parser/selenium.xml";
				String pathQtp =  System.getProperty("user.dir") + "\\src\\xml\\parser\\qtp.xml";  //"C:\\Users\\rinko\\IdeaProjects\\CoreNDSExamJuly2016\\CoreNDSExamJuly2016\\src\\xml\\parser\\qtp.xml"; //System.getProperty("user.dir") + "/src/xml/reader/qtp.xml";
				String tag = "id";


				//Declare a Map with List<String> into it.
				Map<String, List<Student>> map = new LinkedHashMap<String, List<Student>>();

				//Create XMLReader object.
				XmlReader xmlr = new XmlReader();

             //Parse Data using parseData method and then store data into Selenium ArrayList.
				List<Student> seleniumList = new ArrayList<>();
				seleniumList = xmlr.parseData(tag,pathSelenium);
/*
				for(Object stu:seleniumList){
					System.out.println(stu);
				}
*/

				//Parse Data using parseData method and then store data into Qtp ArrayList.
				List<Student> qtpList = new ArrayList<>();
				qtpList = xmlr.parseData(tag,pathQtp);
/*
				for(Object stu:qtpList){
					System.out.println(stu);
				}
*/

				//add Selenium ArrayList data into map.
				//add Qtp ArrayList data into map.
				map.put("Selenium",seleniumList);
				map.put("QTP",qtpList);



                ConnectDB connectDB = new ConnectDB();

               //Retrieve map data and display output.
				System.out.println(".......Retrieve Data from MAP.......");
				for(Map.Entry<String, List<Student>> entry:map.entrySet()){
					System.out.println("---------"+entry.getKey()+ " -------------------- ");

					for(Object stu:entry.getValue()){


					   System.out.println(stu);


					}


				}
            // Data Store into My Database

                //System.out.println("--------------------------------------------------- ");

                // Note : We did not use any structure data base, just stored in a sigle table anc column to check the data store an close.
                // Stored and displayed only for selenium
                for(Object stu:seleniumList){
                    connectDB.InsertDataFromStringToMySql(stu.toString(), "tbl_student", "StudentDetails");
                }

                // DATA READ FROM DATABASE
                List<String> seleniumListA = new ArrayList<String>();
                try {
                    seleniumListA = connectDB.readDataBase("tbl_student", "StudentDetails");
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Data is reading from the Table (tbl_pattern) and displaying to the console");
                for(String st:seleniumListA){
                    System.out.println(st);
                }



			}

}
