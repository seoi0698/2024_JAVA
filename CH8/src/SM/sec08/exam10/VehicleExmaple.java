package SM.sec08.exam10;


public class VehicleExmaple {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
		//vehicle.checkFare(); (x)

		Bus bus = (Bus) vehicle;  //강제타입변환

		bus.run();
		bus.checkFare();
	}
}