package march;

public class CounterTester {

	public static void main(String[] args) {
		/*
		 * Using the attached

Modify CounterTester so that it does the following (remove/change/ add code as needed);

creates a counter called: venue

click 10 times

unclick 5 times

prints expected counter value (5)

prints actual counter value

reset counter

click 3 times

unclick 4 times

prints expected counter value (-1)

prints actual counter value

Your console output from CounterTester should look like this:

Expected: 5
Actual: 5
Expected: -1
Actual: -1
		 */
		Counter venue = new Counter();
		
		
		
		for (int i = 1; i <=10; i++) {
			venue.click();
		}
		for (int i = 1; i <=5; i++) {
			venue.unclick();
		}
		
		int rValue = venue.getValue();
		System.out.println("Expected: 5");
		System.out.println("Actual: " + rValue);
		
		venue.reset();
		
		for (int i = 1; i <=3; i++) {
			venue.click();
		}
		
		for (int i = 1; i <=4; i++) {
			venue.unclick();
		}
		
		int actValue = venue.getValue();
		System.out.println("Expected: -1");
		System.out.println("Actual: " + actValue);
		/*
		System.out.println(rValue);
		
		
		concertCounter.click();
		rValue = concertCounter.getValue();
		System.out.println(rValue);
		
		concertCounter.unclick();
		concertCounter.unclick();
		rValue = concertCounter.getValue();
		System.out.println("concertcounter =" + rValue);
		*/

	}

}
