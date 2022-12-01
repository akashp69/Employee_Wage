package com.bridgelabz;

public class EmployeeWage {
    /**
     * Using Final keyword and static variables for fixed hours
     */
    static final int Total_Working_Hours = 100;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;

    /**
     * This is static Method Used For calculate Employees wages of Differents Companny
     * @param companyName using variables for company
     * @param empperhour using variables for calculate the per hour working
     * @param totalworkingdays using variables for calculate the total  hour working in day
     * @param totaldayinmonths using variables for calculate the total  hour working  days in month
     */

    static void EmployeeWage(String companyName , int empperhour , int totalworkingdays , int totaldayinmonths){
        int day = 1;
        int totalWorkingHours = 0;
        int totalWage = 0;
        while (day <= WORKING_DAYS_PER_MONTH && totalWorkingHours<=Total_Working_Hours) {
            int dailyWage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee FULL TIME");
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    totalWorkingHours=totalWorkingHours + FULL_TIME_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee PART TIME");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingHours=totalWorkingHours + PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee Absent");

            }
            totalWage = totalWage + dailyWage;
            System.out.println("Daily Wage => " + dailyWage);
            day++;
        }
        System.out.println("Total Wage" +totalWage);
        System.out.println("Total Working Hours "+totalWorkingHours);
    }

    /**
     *This is Main Method Is Using For Calling Static Method
     */

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage For Multiples Company ");
        System.out.println("\n SBI BANK ");
        EmployeeWage("SBI" ,100, 20 ,25);
        System.out.println("\n**********************");
        System.out.println("\n AXIS BANK ");
        EmployeeWage("AXIS BANK " ,250, 25 ,28);
        System.out.println("\n**********************");
        System.out.println("\n ICICI BANK ");
        EmployeeWage("ICICI BANK" ,500, 15 ,30);
    }

}