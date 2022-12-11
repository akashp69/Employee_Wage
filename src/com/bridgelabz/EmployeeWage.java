package com.bridgelabz;
   /**
    * Create a class for manage the wages for multiple companies
    */
class CompanyEmpWage {
    /**
     *   Using instance and final keyword for fixed hours
     */
    final String COMPANY_NAME;
    final int WAGE_PER_HR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HRS;
    int totalEmpWage;
    /**
     * Using Non-static methods for calculate the employee wage for multiple comapny
     **/
    CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalEmpWage = 0;
    }
    void setTotalEmployeeWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public String toString() {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalEmpWage + "\n";
    }
}

public class EmployeeWage {
    /**
     * Using the static and final keyword for fixed hours
     */
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    /**
     * Using instances variables for multiple companies
     */
    int noOfCompanies, index;
    /**
     * Using instances variables for calculate the total wages of diffrent companies
     * Using Array
     */
    CompanyEmpWage[] companies;

    public EmployeeWage(int noOfCompanies) {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        index = 0;
    }

    void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
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
        for (CompanyEmpWage company : companies) {
            int totalWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }
    /**
     * Using non-static method for calculate total wage for different companies employees
     */
    int calculateTotalWage(CompanyEmpWage companyEmpWage) {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        return totalWage;
    }
    /**
     * This is a Main Method is using for calling the methods
     */
    public static void main(String args[]) {
        EmployeeWage manageWageMultipleCompanies = new EmployeeWage(3);
        manageWageMultipleCompanies.addCompany("SBI", 4, 30, 100);
        manageWageMultipleCompanies.addCompany("AXIS", 5, 40, 170);
        manageWageMultipleCompanies.addCompany("ICICI", 9, 10, 70);
        manageWageMultipleCompanies.calculateTotalWage();
    }
}

