package com.bridgelabz;

public class EmployeeWage {

    /**
     * This Method is Used For Check The Attendance Of Employees and Calculate Daily Wage
     */
     static void checkEmployeePresentOrAbsent() {
         int present = 1;
         int absent = 0;
         int empWagePerHour = 20;
         int fullDayHour = 8;
         int empcheck = (int) Math.floor(Math.random() * 10) % 2;
         if (empcheck == present) {
             System.out.println("Employee is Present");
             int dailyWage = empWagePerHour * fullDayHour;
             System.out.println("Daily Wage of Employee is" + dailyWage);
         } else {
             System.out.println("Employee is Absent");
             System.out.println("Daily Wage of Employee is Zero");
         }
         }
    /**
     * This Main Method is Used For Calling The Method checkEmployeePresentOrAbsent
     */
    public static void main(String[] args) {
         checkEmployeePresentOrAbsent();

    }
    }
