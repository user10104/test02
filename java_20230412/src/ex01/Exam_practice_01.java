package ex01;

//로또 번호 추첨 시스템

public class Exam_practice_01 {

	public static void main(String[] args) {

		
		int[] lotto = new int [45]; //배열생성줄, lotto라는 이름의 배열을만들어줌
		
		for(int i = 0; i < lotto.length ; i ++ )
			lotto[i] = i+1; //뭔역할인진 모르겠지만 로또의 번호값에 1을더해준다는건알겠어요
		
		for(int i = 0 ; i < lotto.length ; i ++) {
			int num = (int)(Math.random()*45); //45까지의 수를 섞는다
			int tmp = lotto[i]; // 실행되고있는 lotto 배열의 순번을 tmp변수에 저장한다.
			lotto[i] = lotto[num]; // 1순번에 섞인수 저장 , 아마 무작위로 섞이고 1번슬롯에 지정된 값 출력을 위해 덮어쓴 것
			lotto[num] = tmp; //아까 1변수를 다시 num값에 넣어줌으로서 1과 섞인 수의 자리는변경된다. 무작위로 선별이 아닌
			// 자리 바꾸기 이므로 중복이 나오지 않음.
		}
		System.out.println("이번주 로또 번호는 : ");
		for (int i = 0; i < 6; i ++) // 저 앞의 무작위로 섞인 숫자들 중 앞의 6개만 출력할수있는 명령이다
			System.out.print(lotto[i] + ",");
		
	}

}
