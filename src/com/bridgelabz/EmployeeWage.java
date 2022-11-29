package com.bridgelabz;

public class EmployeeWage {
    /**
     * This Method is Used For Check The Attendance Of Employees
     */
    static void checkEmployeePresentOrAbsent(){
    /**
     *Using present and employeeCheck Variable for getting attendance of Employee
     */
        int present = 1;
        int employeeCheck = (int) Math.floor(Math.random()*10)%2;
        if (employeeCheck == present) {
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
    /**
     * This Main Method is Used For Calling The Method checkEmployeePresentOrAbsent
     */

    public static void main(String args[]) {
        checkEmployeePresentOrAbsent();
    }
}
