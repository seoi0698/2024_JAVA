package ex1126;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
//		
//		m.TestTV(new RemoteController() {
//			public void TurnOn() {
//				System.out.println("turn on test");
//			}
//			public void TurnOn() {
//				System.out.println("turn off test");
//			}
//		}
//		);
		RemoteContraller rc = new TV();
		m.TestTV(rc);
	}
	void TestTV(RemoteController rc) {
		rc.TurnOn();
		rc.TurnOff();
	}

}
