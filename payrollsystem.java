
public class payrollsystem {
    public static void main(String[] args) {
        String employeeNumber = "820126853951";
        String employeeName = "Garcia	Manuel III";
        String birthDate = "1998-12-25";
        String address = "Valero Carpark Building Valero Street 1227, Makati City";
        String phoneNumber = "966-860-270";
        String emailAddress = "abc@gmail.com";
        String tin ="442-605-657-000";
        String sss = "44-4506057-3d";
        String pagibig = "691295330870";
        String philhealth = "820126853951";
        double sssDeduction = 0.00;
        double pagibigDeduction = 0.00;
        double philhealthDeduction = 0.00;
        double tinDeduction = 0.00;
    
        String employeedeductions = "Employee Deductions:";

        String position = "Chief Executive Officer";
        double basicSalary = 90000;
        double ricesubsidy = 5000;
        double phoneallowance =2000;
        double clothingallowance = 1000;
        double grosssemimonthlyrate = 45000;
        double HourlyRate = 535.71;
       System.out.println();
            System.out.println("Employee Details:");
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Birth Date: " + birthDate);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber); 
            System.out.println("Email Address: " + emailAddress);
            System.out.println("TIN: " + tin);
            System.out.println("Philhealth: " + philhealth);
            System.out.println("Pag-ibig: " + pagibig);
            System.out.println("SSS: " + sss);
            System.out.println("Employee number: "+ employeeNumber);
            System.out.println("Position: " + position);
            System.out.println("Hourly Rate: " + HourlyRate);
            System.out.println("Enter employee id: " + employeeNumber);
            System.out.println("Enter employee salary: " + basicSalary); 
            System.out.println();                  
            System.out.println();
            System.out.println( employeedeductions );
            System.out.println("SSS: " +sssDeduction);
            System.out.println("Pag-ibig: " +pagibigDeduction);
            System.out.println("Philhealth: " +philhealthDeduction);
            System.out.println("Income tax: " +tinDeduction);
            System.out.println("Total Deductions: " + (sssDeduction + pagibigDeduction + philhealthDeduction + tinDeduction));
            System.out.println();
            System.out.println("Employee Benefits:");
            System.out.println("Rice Subsidy: " +ricesubsidy);
            System.out.println("Phone Allowance: " +phoneallowance);
            System.out.println("Clothing Allowance: " +clothingallowance);
            System.out.println("Gross Semi-Monthly Rate: " +grosssemimonthlyrate);
            System.out.println("Net Pay: PHP " + (basicSalary - (sssDeduction + pagibigDeduction + philhealthDeduction + tinDeduction)));
            System.out.println();

        }
}