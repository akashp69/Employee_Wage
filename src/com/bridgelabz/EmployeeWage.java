package com.bridgelabz;

public class EmployeeWage {

    /**
     * This Method is Used For Check The Attendance Of Employees and add Partime Wage
     */
    private static void checkEmployeePresentOrAbsent() {
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int halfDayHour = 4;
        int partTimeHour = 2;
        int fullTime = 1;
        int employeecheck = (int) Math.floor(Math.random() * 10) % 3;
        if (employeecheck == fullTime) {
            System.out.println("Employee is Present");
            int dailyWage = empWagePerHour * fullDayHour;
            System.out.println("Daily Wage of Employee is" + dailyWage);
            System.out.println("Daily Wage of Employee in Full Time is" + dailyWage);
        } else if (employeecheck == partTimeHour) {
            int partTimeWage = empWagePerHour * halfDayHour;
            System.out.println("Daily Wage of Employee in Part Time is" + partTimeWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Employee is Absent so Daily Wage is 0");

        }
    }
    /**
     * This Main Method is Used For Calling The Method checkEmployeePresentOrAbsent
     */
    public static void main(String[] args) {
         checkEmployeePresentOrAbsent();

    }
    }
