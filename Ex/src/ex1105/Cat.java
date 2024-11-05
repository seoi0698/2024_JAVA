package ex1105;

public class Cat {
	static double normalJumpHeight = 1;
	double jumpHeight;
	
	public Cat(double jumpHeight) {
		this.jumpHeight = jumpHeight;
		
	}
	
	public boolean IsHealthy() {
		if(jumpHeight > normalJumpHeight)
			return true;
		else
			return false;
		
	}
}
