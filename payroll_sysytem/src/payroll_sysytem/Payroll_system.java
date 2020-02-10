package payroll_sysytem;
import java.util.*;


public class Payroll_system {
	public static void main(String[] args) {
		String name, position;
		double wage, allowance, hoursWorked, deductions  = 0, totalIncome, overtime, calculated_overtime,income;
		double tax, nationalInsurance, netPay;
	int choice;
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("----------------------------------");
	System.out.println("          PAYROLL SYSTEM          ");
	System.out.println("----------------------------------");
	System.out.println(" Enter Employee's data  \n\n  ");
	System.out.println(" Name: ");
	name = in.nextLine();
	System.out.println(" Position: ");
	position = in.nextLine();
	System.out.println(" What's your wage per hour? :");
	wage = in.nextDouble();
	System.out.println(" How many hours have you worked?(Month) :");
	hoursWorked = in.nextDouble();
	System.out.println(" Allowances :");
	allowance = in.nextDouble();
	System.out.println(" Overtime(in hours) :");
	overtime = in.nextDouble();
	income = wage*hoursWorked;
	
	calculated_overtime = wage*overtime;
	totalIncome = income + allowance + calculated_overtime;
	
	System.out.println(" TOTAL INCOME : £ " + totalIncome);
	
	
	
	System.out.println("\n\n----------------------------- ");
	System.out.println(" D E D U C T I O N S  ");
	System.out.println("------------------------------- \n");
	System.out.println("Specify Tax Bracket \n\n");
	System.out.println("(1) Single (2) Married (3) Widow");
	System.out.println("\n\n Enter your Choice: " );
	choice  = in.nextInt();
	if (choice == 1) {
		tax = totalIncome * 0.2;
		nationalInsurance = totalIncome * 0.14;
		deductions = tax + nationalInsurance;
		System.out.println("TAX deductions = " +tax);
		System.out.println("National Insurance  deductions = " + nationalInsurance);
		System.out.println("\n\n\n  You  have been deducted:" + deductions);
	}
	
	else if  (choice == 2) {
		tax = totalIncome * 0.1;
		nationalInsurance = totalIncome * 0.07;
		deductions = tax + nationalInsurance;
		System.out.println("TAX deductions = " +tax);
		System.out.println("National Insurance  deductions = " + nationalInsurance);
		System.out.println("\n\n\n  You  have been deducted:" + deductions);
	}
	
	else if (choice  == 3){
		tax = totalIncome * 0.01;
		nationalInsurance = totalIncome * 0.05;
		deductions = tax + nationalInsurance;
		System.out.println("TAX deductions = " +tax);
		System.out.println("National Insurance  deductions = " + nationalInsurance);
		System.out.println("\n\n\n  You  have been deducted:" + deductions);
	}
	else {
		System.out.println("There was something wrong with your input. Please seek assistance.");
	}
	
	
	System.out.println("\n\n ---------------------------");
	System.out.println("         Payroll Slip           ");
	System.out.println("------------------------------\n");
	System.out.println(" Name : " + name);
	System.out.println(" Position : " + position);
	System.out.println(" Monthly Salary : " + income);
	System.out.println(" Allowances : " + allowance);
	System.out.println(" Overtime : " + calculated_overtime);
	System.out.println(" Total Income : " + totalIncome);
	System.out.println("\n Total Deductions : " + deductions);
	netPay  = totalIncome - deductions;
	System.out.println("\n\n NetPay : £ " + netPay);
	}

}
