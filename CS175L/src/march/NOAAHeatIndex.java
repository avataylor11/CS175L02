package march;

import java.util.Scanner;

public class NOAAHeatIndex {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("                                       NOAA's National Weather Service");
		System.out.println("                                                  Heat Index");
		System.out.println(" ");
		System.out.println("Relative                                        Temperature(F)");
		System.out.println("Humidity(%)");
		
		System.out.printf("       ");
		
		//temp
		for (int temp = 80; temp <= 110; temp = temp+2) {
			System.out.printf("%6d", temp);
		}
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		
		//relative humidity
		for (int humidity = 40; humidity <= 100; humidity = humidity+5) {
			System.out.printf("%3d  | ", humidity);
			
			//heat index
			for(int a = 80; a <= 110; a = a + 2) {
				//calc
				String blank = " ";
				
				int calculation = (int)(-42.379 + (2.04901523*a) + (10.14333127*humidity) - 
						(.22475541*a*humidity) - (.00683783*a*a) - (.05481717*humidity*humidity) + 
						(.00122874*a*a*humidity) + (.00085282*a*humidity*humidity) - .00000199*a*a*humidity*humidity);
				if (calculation <= 137) {
					System.out.printf("%6d", calculation);
				}
				else
					System.out.printf("%6s", blank);
			
			}
			System.out.println();
		}
	
		//•	If the THI is <90 advisory should be Caution.
		//•	else If the THI is <105 advisory should be Extreme Caution
		//•	else If the THI is <126 advisory should be Danger
		//•	else the advisory should be Extreme Caution
		boolean run = true;
		while(run == true){
			System.out.println("Enter temperature or 0 to end: ");
			double temp2 = kb.nextDouble();
			if (temp2 == 0) {
				run = false;
				System.out.println("You quit");
				break;
			}
		
			
			System.out.println("Enter relative humidity: ");
			double humidity2 = kb.nextDouble();
			
			double thi = -42.379 + (2.04901523*temp2) + (10.14333127*humidity2) - 
					(.22475541*temp2*humidity2) - (.00683783*temp2*temp2) - (.05481717*humidity2*humidity2) + 
					(.00122874*temp2*temp2*humidity2) + (.00085282*temp2*humidity2*humidity2) - .00000199*temp2*temp2*humidity2*humidity2;
			System.out.println("The THI for a temperature of " + (int)temp2 + " and relative humidity of " + (int)humidity2 + " is " + (int)thi);
			
			if (thi <= 90) {
				System.out.println("Advisory: Caution");
			}
			else if (thi < 105) {
				System.out.println("Advisory: Extreme Caution");
			}
			else if (thi < 126) {
				System.out.println("Advisory: Danger");
			}
			else {
				System.out.println("Advisory: Extreme Danger");
			}
		}
	}

}
