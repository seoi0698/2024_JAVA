package SM.sec04.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("score point 100~90.");
			System.out.println("level A.");
		}else if(score >= 80) {
			System.out.println("score point 89~80.");
			System.out.println("level B.");
		}else if(score >= 70) {
			System.out.println("score point 79~70.");
			System.out.println("level C.");
		}else {
			System.out.println("score point lower than 70.");
			System.out.println("level D.");
		}
		// TODO Auto-generated method stub

	}

}
