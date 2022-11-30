package com.bridgelabz;

public class EmployeeWage {
    /**
     * Using Static Variable and finale keyword for fixed hours
     */
    static final int Total_Working_Hours = 100;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 8;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;

    /**
     * This Main Method is Using For Calculate total working hours in month
     *
     */

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage");
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
}