import java.util.Scanner;

public class CarCostCalculation {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Regular Car
		System.out.println("Enter cost of regular car: ");
		int regCost= keyboard.nextInt();
		
		System.out.println("Enter miles per gallon of regular car: ");
		int regMiles= keyboard.nextInt();
		
		//Hybrid Car
		System.out.println("Enter cost of hybrid car: ");
		int hybridCost= keyboard.nextInt();
		
		System.out.println("Enter miles per gallon of hybrid car: ");
		int hybridMiles= keyboard.nextInt();
		
		//Miles per year
		System.out.println("Enter miles traveled in a year: ");
		int yearMiles= keyboard.nextInt();
		
		//Gas
		System.out.println("Enter cost per gallon of gas: ");
		double gasCost= keyboard.nextDouble();
		
		//Calculations
		//Year 1
		double regTotal1 = regCost + (yearMiles / regMiles * gasCost);
		double hybridTotal1 = hybridCost + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 1 for regular car: " + regTotal1 + " for hybrid car: " + hybridTotal1);
		
		//Year 2
		double regTotal2 = regTotal1 + (yearMiles / regMiles * gasCost);
		double hybridTotal2 = hybridTotal1 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 2 for regular car: " + regTotal2 + " for hybrid car: " + hybridTotal2);
		
		//Year 3
		double regTotal3 = regTotal2 + (yearMiles / regMiles * gasCost);
		double hybridTotal3 = hybridTotal2 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 3 for regular car: " + regTotal3 + " for hybrid car: " + hybridTotal3);
	
		//Year 4
		double regTotal4 = regTotal3 + (yearMiles / regMiles * gasCost);
		double hybridTotal4 = hybridTotal3 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 4 for regular car: " + regTotal4 + " for hybrid car: " + hybridTotal4);
		
		//Year 5
		double regTotal5 = regTotal4 + (yearMiles / regMiles * gasCost);
		double hybridTotal5 = hybridTotal4 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 5 for regular car: " + regTotal5 + " for hybrid car: " + hybridTotal5);
		
		if (regTotal5 > hybridTotal5) {
			System.out.println("The hybrid car pays back after 5 years");
		}
		else {
			System.out.println("The regular car pays back after 5 years");
		}
		
		
		
		//cost of reg car plus miles divided by miles per gallon times cost per gallon
	}

}
