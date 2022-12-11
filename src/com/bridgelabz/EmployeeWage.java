package com.bridgelabz;
public class EmployeeWage {
    /**
     * Using the static and final keyword for fixed time
     */
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;
    /**
     * Using instances variables for diffrent companies
     */
    final String COMPANY_NAME;
    final int WAGE_PER_HR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HRS;
    /**
     * Using instances variables for calculate the total wages of diffrent companies
     */

    int totalWage;

    EmployeeWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalWage = 0;
    }
    /**
     * Using non-static method for check employee parttime , fulltime and absent
     */
    int generateEmployeeType() {
        return (int) (Math.random() * 100) % 3;
    }
    /**
     * Using non-static method for calculate the working hours of  different companies employes
     */
    int getWorkingHrs(int empType) {
        switch (empType) {
            case FULL_TIME:
                return 8;

            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }
    /**
     * Using non-static method for calculate total wage for different companies employees
     */
    void calculateTotalWage() {
        System.out.println("Computation of total wage of " + COMPANY_NAME + "employee");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        int workingHrs = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {

            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
    }

    public String toString() {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour: " + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
    }
    /**
     * This is a Main Method is using for calling the methods
     */
    public static void main(String args[]) {
        EmployeeWage sbi = new EmployeeWage("SBI", 8, 20, 100);
        EmployeeWage axis = new EmployeeWage("AXIS", 5, 30, 150);
        EmployeeWage icici = new EmployeeWage("ICICI", 8, 18, 110);

        sbi.calculateTotalWage();
        System.out.println(sbi);
        axis.calculateTotalWage();
        System.out.println(axis);
        icici.calculateTotalWage();
        System.out.println(icici);
    }

}