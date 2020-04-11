package march;

public class Counter {
	private int value;

	public int getValue() {
		return value;
		
	}
	
	public void click() {
		value = value + 1;
	}
	
	public void unclick() {
		value = value - 1;
	}
	
	public void reset() {
		value = 0;
	}
	
	public void clickMany(int val) {
		value = value + val;
	}
	
	public void unclickMany(int val) {
		value = value - val;
	}
	

}
