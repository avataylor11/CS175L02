package march;

public class CounterTester {

	public static void main(String[] args) {
		
		Counter venue = new Counter();
		
		Counter anotherValue = new Counter();
		
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
		
		
		anotherValue.clickMany(10);
		anotherValue.unclickMany(5);
		int realValue = anotherValue.getValue();
		System.out.println("Expected: 5");
		System.out.println("Actual: " + realValue);
		
		anotherValue.reset();
		anotherValue.clickMany(3);
		anotherValue.unclickMany(4);
		int newValue = venue.getValue();
		System.out.println("Expected: -1");
		System.out.println("Actual: " + newValue);


	

	}

}
