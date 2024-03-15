
public class FrogDriver {
	public static void main(String[]args) {
	
	FrogSimulation sim = new FrogSimulation (24,5);
	double pr = sim.runSimulations(400);
	System.out.println(pr);
		
	}//end main
}//end class
