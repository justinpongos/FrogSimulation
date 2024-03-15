
public class FrogSimulation {

	private int goalDistance;
	private int maxHops;
	
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}//end multi argument constructor
	
	private int hopDistance() {
		int d = (int)(Math.random()*63) -31;
		return d;
	}//end hopDistamce method
	
	public boolean simulate() {
		boolean state = false;
		int s = 0;
		for (int index = 0; index < maxHops; index++) {
			s = s + hopDistance();
			if (s > goalDistance) {
				state = true;
				}//end if
			}//end for
			return state;
	}//end simulate method
	
	public double runSimulations(int num) {
		int o = 0;
		for (int index = 0; index < num; index++) {
			if(simulate()) {
			o++;
			}//end if
		}//end for
		double y= (double)o/num;
		return y;
	}//end runSim method
}//end class
