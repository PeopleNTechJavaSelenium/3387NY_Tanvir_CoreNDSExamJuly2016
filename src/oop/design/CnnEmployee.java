package oop.design;

import java.util.List;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/


	public static void main(String[] args) {
		
      // Add Employee and Stored in Database

		EmployeeInfo employeeInfo = new EmployeeInfo();
        // EMP ID Can't be duplicated
        EmployeeData employeeData = new EmployeeData(132,"1981-01-07","Kamrul","Hasan","M","2000-10-20",1);
	   employeeInfo.addNewEmployee(employeeData);

     // View Employee From Database

		List<EmployeeData> getEmpDATA = employeeInfo.getAllEmployeeData();

        for(EmployeeData emData : getEmpDATA)
        {
            System.out.println(emData.getFirstName()+" "+emData.getLastName());
        }


        // View benefitLayout
        employeeInfo.benefitLayout();

        //


        //employeeInfo.calculateEmployeBonus
        System.out.println("Bonus : "+EmployeeInfo.calculateEmployeBonus(20000.30,"average"));

        System.out.println("Pension "+EmployeeInfo.calculateEmployePension(12000,2));



    }

}
