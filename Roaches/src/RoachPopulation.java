
public class RoachPopulation {
	
	private int pop;
	
	public void startRoach(int total) {
		pop = total;
	}
	
	public int getRoaches() {
		return pop;
	}
	
	public void breed() {
		pop = pop*2;
	}
	
	public void spray(int num) {
		pop = pop-(pop*num)/100;
		
	}
	
	

}
