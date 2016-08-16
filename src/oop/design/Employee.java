package oop.design;

import java.util.Date;
import java.util.List;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.


	//employeeId() will return employee id.
	public int employeeId();
	
	//employeeName() will return employee name
	public String employeeName();
	
	//assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee benefit
	public void benefitLayout();

	// Add New Employee
    public void addNewEmployee(EmployeeData employeeData);

    // Update Employee Basic Data
    public void UpdateEmployee(int empId);

	 // Get All Employee List
    public List<EmployeeData> getAllEmployeeData();

    //Get Employee Birthday
    public Date employeeBithday(int EmpId);

    //Calculate Employee Age
    public String AgeCalcuation(int empId);

    // ADD Employee Contact Information

    public void addContactInformation(EmployeeContactData employeeContactData,int empId);

    // View Employee Contact Details View
    public List<EmployeeContactData> getEmployeeContact(int emp_id);

    // this method will calculate the leave balance
    public int TotalLeaveBalance(int emp_id);




}
