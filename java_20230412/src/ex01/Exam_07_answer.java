package ex01;

//6개의 정수 출력.... ex) 로또 시스템

public class Exam_07_answer {

	public static void main(String[] args) {

		int [] num = new int[6];
		int com = 0;
		
		
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = i ; j < num.length ; j++) 
				com = (int)(Math.random()*(1+60))+1;
		System.out.print(com+",");}
		

	}}



//1 나오는거 확인
//중첩된다 망했다