package ex05;

import java.util.function.Function;

public class Example {
	
	private static Student[] students = {
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
			
	};
			//avg()메소드 작성
//	private static double avg (Function<Student> f) {
	private static double avg (Function<Student, Integer> f) { //import function, 위 메소드와 다르게 다른 인터페이스 클래스 없이 실행 가능
		int sum =0;
		for (Student student : students)
			sum += f.apply(student);
		
		return(double)sum/students.length;
	}

	public static void main(String[] args) {
		
		double englishAvg =avg(s->s.getEnglshScore());
		System.out.println("영어 평균 점수: "+ englishAvg);
		
		double mathAvg = avg(s->s.getMathScore());
		System.out.println("수학 평균 점수: "+ mathAvg);
		
	}

}
