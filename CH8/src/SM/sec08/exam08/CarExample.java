package SM.sec08.exam08;


public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KunmhoTire();
		myCar.frontRightTire = new KunmhoTire();
		
		myCar.run();
	}
}
