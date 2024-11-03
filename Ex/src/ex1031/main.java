package ex1031;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car = new Car(100);
		//System.out.println("speed : " + car.speed);
		Truck truck = new Truck(80);
		truck.ShowSpeed();
		//System.out.println("speed : " + truck.speed);
		Car car = truck;
		car.ShowSpeed();
		//System.out.println("speed : " + car.speed);
	}

}
