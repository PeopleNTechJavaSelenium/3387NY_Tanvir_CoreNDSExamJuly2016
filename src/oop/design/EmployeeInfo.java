package oop.design;

import DBConnection.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeInfo extends EmployeeAttendance implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;

	private int empId;

	private String firstName;
	private String  lastName;

  // DB operation Variables

	Connection connect = null;
	Statement statement = null;
	PreparedStatement ps = null;
	ResultSet resultSet = null;

	ConnectDB connectDB = new ConnectDB();
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */


	public EmployeeInfo(){
		super.addAttendanceIn(101,"2016-08-15","NYOffice-1");
	}


	public EmployeeInfo(int empId, String firstName, String lastName){

    	this.empId=empId;

		this.firstName = firstName;
		this.lastName = lastName;

	}



	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeBonus(double salary,String performance){
		double total=0;
		performance = performance.toLowerCase();

		if(performance=="best")
		{
		 total = salary*(.10);
		}
		else if(performance=="average")
		{
			total = salary*(.08);
		}
		else  // By Default 1 percent
		{
			total = salary*(.01);
		}


		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployePension(double monthySalary,int years){
		double yearlySalary = monthySalary*12;
		double total=0;

		if(years==1)
		{
			total = yearlySalary*(.05)*years;
		}
		else if(years==2)
		{
			total = yearlySalary*(.10)*years;
		}
		else if(years==3)
		{
			total = yearlySalary*(.20)*years;
		}
		else if(years==4)
		{
			total = yearlySalary*(.30)*years;
		}
		else if(years==5)
		{
			total = yearlySalary*(.40)*years;
		}
		else if(years==6)
		{
			total = yearlySalary*(.50)*years;
		}

		else  // By Default 1 percent // it may continue n years
		{
			total = yearlySalary*(.60);
		}

		return total;
	}

	@Override
	public int LateAttendanceCount(int empId) {
		return 0;
	}

	//polymorphism


	public int LateAttendanceCount(int empId, Date dtFrom, Date dtTo) {
		return 0;
	}

	@Override
	public int employeeAbsenceCount(int empId) {
		return 0;
	}

	// polymorphism
	public int employeeAbsenceCount(int empId, Date dtFrom, Date dtTo)
	{
		return 0;
	}
	@Override
	public void employeeDeptChange(int empid, int newDeptId) {

	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}

	@Override
	public int calculateSalary() {
		return 0;
	}

	@Override
	public void benefitLayout() {

	}

	@Override
	public void addNewEmployee(EmployeeData employeeData) {


		try{
			connect = connectDB.connectToDatabase2();
			ps = connect.prepareStatement("INSERT INTO employees (emp_no,birth_date,first_name,last_name,gender,hire_date,emp_status) VALUES(?,?,?,?,?,?,?)");
			ps.setInt(1,employeeData.getEmpId());
			ps.setString(2,employeeData.getBirthDate());
			ps.setString(3,employeeData.getFirstName());
			ps.setString(4,employeeData.getLastName());
			ps.setString(5,employeeData.getGender());
			ps.setString(6,employeeData.getHireDate());
			ps.setInt(7,employeeData.getEmpStatus());
			ps.executeUpdate();
			System.out.println("employees Created Successfully ");

			//System.out.println("INSERT INTO tbl_book_list (BookName,BookDetails,BookAuthor,VersionNumber,PublishedYear,BookStatus) VALUES(?,?,?,?,?,?)");



		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			close();
		}

	}

	@Override
	public void UpdateEmployee(int empId) {

	}

	@Override
	public List<EmployeeData> getAllEmployeeData() {
		List<EmployeeData> employeeDatas = new ArrayList<EmployeeData>();
		try{
			connect = connectDB.connectToDatabase2();


			//System.out.println("INSERT INTO tbl_book_list (BookName,BookDetails,BookAuthor,VersionNumber,PublishedYear,BookStatus) VALUES(?,?,?,?,?,?)");
			//List<EmployeeData> employeeDatas = new ArrayList<EmployeeData>();

			statement = connect.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM employees");
			while (resultSet.next())
			{
				EmployeeData employeeData = new EmployeeData();
				employeeData.setEmpId(resultSet.getInt("emp_no"));
				employeeData.setBirthDate(resultSet.getString("birth_date"));
				employeeData.setFirstName(resultSet.getString("first_name"));
				employeeData.setLastName(resultSet.getString("last_name"));
				employeeData.setGender(resultSet.getString("gender"));
				employeeData.setHireDate(resultSet.getString("hire_date"));
				//employeeData.getEmpStatus(resultSet.getInt("emp_status"));
				employeeDatas.add(employeeData);
			}


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			close();
		}


		return employeeDatas;
	}

	@Override
	public Date employeeBithday(int EmpId) {
		return null;
	}

	@Override
	public String AgeCalcuation(int empId) {
		return null;
	}

	@Override
	public void addContactInformation(EmployeeContactData employeeContactData,int empId) {

		// This Method will be add New Contact for employee

	}

	@Override
	public List<EmployeeContactData> getEmployeeContact(int emp_id) {
		return null;
	}

	@Override
	public int TotalLeaveBalance(int emp_id) {
		return 0;
	}

	// Database variable Close Methods

	private void close() {
		try{
			if(resultSet != null){
				resultSet.close();
			}
			if(statement != null){
				statement.close();
			}
			if(connect != null){
				connect.close();
			}
		}catch(Exception e){

		}
	}

}
