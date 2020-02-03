package january;
import java.util.Scanner;

public class HouseProject {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("To find out the total cost of painting your house, enter the following criteria rounded to the nearest whole number.");
		
		
		System.out.println("Enter the length of the house :: ");
		int houseLength = keyboard.nextInt();
		
		System.out.println("Enter the width of the house :: ");
		int houseWidth = keyboard.nextInt();
		
		System.out.println("Enter the height of the house :: ");
		int houseHeight = keyboard.nextInt();
		
		System.out.println("Enter the number of windows in the house :: ");
		int numWindows = keyboard.nextInt();
		
		System.out.println("Enter the length of the windows in house :: ");
		int windowLength = keyboard.nextInt();
		
		System.out.println("Enter the width of the windows in house :: ");
		int windowWidth = keyboard.nextInt();
		
		System.out.println("Enter the number of doors in the house :: ");
		int numDoors = keyboard.nextInt();
		
		System.out.println("Enter the length of the doors in the house :: ");
		int doorLength = keyboard.nextInt ();
		
		System.out.println("Enter the width of the doors in the house :: ");
		int doorWidth = keyboard.nextInt ();
		
		System.out.println("Enter the charge per square foot to paint the house :: ");
		int chargeFoot = keyboard.nextInt ();
		
		int peakTotal = 2*(houseLength * houseWidth + (houseLength * (houseHeight - houseWidth))/2);

		int normalTotal = 2*(houseLength * houseWidth);
		
		int dimWindows = windowLength * windowWidth;
		
		int totalWindow = numWindows * dimWindows;
		
		int dimDoors = doorLength * doorWidth;
				
		int totalDoor = numDoors * dimDoors;
		
		int totalHouse = peakTotal + normalTotal;
		
		int finalDimension = totalHouse - totalWindow - totalDoor;
		
		int totalCost = finalDimension * chargeFoot;
		
		System.out.println("Your total cost is $" + totalCost);



	}

}
