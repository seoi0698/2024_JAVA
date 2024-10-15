package SM.sec01.exam01;

import SM.sec01.exam01.student;

public class studentExample {
	public static void main(String[] args) {
		student s1 = new student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		student s2 = new student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
