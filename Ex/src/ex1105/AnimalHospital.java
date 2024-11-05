package ex1105;

public class AnimalHospital {
	public void CheckPatient(Dog dog) {
		if(dog.IsHealthy())
			System.out.println("health");
		else
			System.out.println("heal");
		
		
	}
	public void CheckPatient(Cat cat) {
		if(cat.IsHealthy())
			System.out.println("health");
		else
			System.out.println("heal");
	}
}
