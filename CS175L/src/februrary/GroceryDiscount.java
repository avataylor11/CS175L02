package februrary;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		boolean outcome = true;
		double discount;
		
		while (outcome == true){
		
			System.out.println("Please enter the cost of your groceries or '0' to quit: ");
			double cost = keyboard.nextDouble();
			
			if(cost<10 && cost>0) {
				discount = 0;
				System.out.println("You are not eligable for a coupon this time.");
			}
			else if(cost>=10 && cost<=60) {
				discount = cost * 0.08;
				String total = df.format(discount);
				System.out.println("You win a disocunt coupon of $" + total + ". (8% of your purchase)");
			}
			else if(cost>60 && cost<=150) {
				discount = cost * 0.10;
				String total = df.format(discount);
				System.out.println("You win a disocunt coupon of $" + total + ". (10% of your purchase)");
			}
			else if(cost>150 && cost<=210) {
				discount = cost* 0.12;
				String total = df.format(discount);
				System.out.println("You win a disocunt coupon of $" + total + ". (12% of your purchase)");
			}
			else if (cost>210) {
				discount = cost * 0.14;
				String total = df.format(discount);
				System.out.println("You win a disocunt coupon of $" + total + ". (14% of your purchase)");
			}
			else{
				outcome = false;
				System.out.println("You quit the program");
			}
		}

	}

}
