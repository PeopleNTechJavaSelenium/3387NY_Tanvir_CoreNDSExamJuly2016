package oop.design;

/**
 * Created by rinko on 8/15/2016.
 */
public abstract class EmployeeAttendance {

    public void addAttendanceIn(int empId, String dt,String deviceId)
    {
        // Add In TIme and Date for attendance
        System.out.println("Emp ID: "+empId+" Date: "+dt+" Status : YES" );
    }

    public void addAttendanceOut(int empId, String dt,String deviceId)
    {
       System.out.println("This function add attendance Out Data");
        // Add In TIme and Date for attendance
    }

    // This function will return the Late attendance of a date range
    public abstract int LateAttendanceCount(int empId);

    // This is for Employee absence Count
    public abstract int employeeAbsenceCount(int empId);

    public abstract  void employeeDeptChange(int empid,int newDeptId);


}
