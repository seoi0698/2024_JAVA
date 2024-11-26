package ex1119;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
//		Parent parent = new Child();
		Parent parent = new Parent() {
			int age = 10;
			public void ShowInfo() {
				System.out.println("My naem is " + name);
				System.out.println("My age is " + age);
				
			}
		};
		m.Check(parent);
		// TODO Auto-generated method stub

	}

	void Check(Parent parent) {
		parent.ShowInfo();
	}
}
