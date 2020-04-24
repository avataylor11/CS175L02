
public class RoachSimulation {

	public static void main(String[] args) {
		
		RoachPopulation bugs = new RoachPopulation();
		
		
		bugs.startRoach(10);
		int totalRoach = bugs.getRoaches();
		System.out.println("The Initial Roach population is " + totalRoach);
		
		bugs.breed();
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 1 breeding is " + totalRoach);
	
		bugs.spray(50);
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 1 50% spraying is " + totalRoach);
		
		bugs.breed();
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 2 breeding is " + totalRoach);
		
		bugs.spray(60);
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 2 60% spraying is " + totalRoach);

		bugs.breed();
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 3 breeding is " + totalRoach);
		
		bugs.spray(70);
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 3 70% spraying is " + totalRoach);
	
		bugs.breed();
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 4 breeding is " + totalRoach);
	
		bugs.spray(80);
		totalRoach = bugs.getRoaches();
		System.out.println("The Roach population after cycle 4 80% spraying is " + totalRoach);
	}
	

}
