package ex1105;

public class Dog {
	static double normalRunSpeed = 50;
	double runSpeed;
	
	public Dog(double runSpeed) {
		this.runSpeed = runSpeed;
		
	}
	public boolean IsHealthy() {
		if(runSpeed > normalRunSpeed)
			return true;
		else
			return false;
	}
}
