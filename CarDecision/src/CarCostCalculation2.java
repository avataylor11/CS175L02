import java.util.Scanner;

public class CarCostCalculation2 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Regular Car
		System.out.println("Enter the make and model of the regular car, the cost to purchase, followed by the miles per gallon: ");
		String regCar= keyboard.nextLine();
		String regName = regCar.substring(0, 14);
		String regCostString = regCar.substring(15,20);
		int regCost = Integer.parseInt(regCostString);
		String regMilesString = regCar.substring(21);
		int regMiles = Integer.parseInt(regMilesString);
		
		//Hybrid Car
		System.out.println("Enter the make and model of the hybrid car, the cost to purchase, followed by the miles per gallon:");
		String hybridCar= keyboard.nextLine();
		String hybridName = hybridCar.substring(0, 12);
		String hybridCostString = hybridCar.substring(13,18);
		int hybridCost = Integer.parseInt(hybridCostString);
		String hybridMilesString = hybridCar.substring(19);
		int hybridMiles = Integer.parseInt(hybridMilesString);
	
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
		System.out.println("Cost to own after year 1 for " + regName + ": " + regTotal1 + " and for " + hybridName + ": "+ hybridTotal1);
		
		//Year 2
		double regTotal2 = regTotal1 + (yearMiles / regMiles * gasCost);
		double hybridTotal2 = hybridTotal1 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 1 for " + regName + ": " + regTotal2 + " and for " + hybridName + ": "+ hybridTotal2);
		
		//Year 3
		double regTotal3 = regTotal2 + (yearMiles / regMiles * gasCost);
		double hybridTotal3 = hybridTotal2 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 1 for " + regName + ": " + regTotal3 + " and for " + hybridName + ": "+ hybridTotal3);
	
		//Year 4
		double regTotal4 = regTotal3 + (yearMiles / regMiles * gasCost);
		double hybridTotal4 = hybridTotal3 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 1 for " + regName + ": " + regTotal4 + " and for " + hybridName + ": "+ hybridTotal4);
		
		//Year 5
		double regTotal5 = regTotal4 + (yearMiles / regMiles * gasCost);
		double hybridTotal5 = hybridTotal4 + (yearMiles / hybridMiles * gasCost);
		System.out.println("Cost to own after year 1 for " + regName + ": " + regTotal5 + " and for " + hybridName + ": "+ hybridTotal5);
		
		if (regTotal5 > hybridTotal5) {
			System.out.println("The " + hybridName + " pays back after 5 years");
		}
		else {
			System.out.println("The " + regName + " pays back after 5 years");
		}
		
		
		
		//cost of reg car plus miles divided by miles per gallon times cost per gallon
	}

}
