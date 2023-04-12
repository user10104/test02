package ex01;

//6개의 정수 출력.... ex) 로또 시스템

public class Exam_07 {

	public static void main(String[] args) {

		int [] lotto = new int[45];
		
		
		for(int i = 0 ; i < lotto.length ; i++) 
			lotto[i] = i+1;
			
			for(int i = 0; i < lotto.length ; i ++) {
				int num = (int)(Math.random()*45); // +1 붙이지 않기 // 45개 셔플, 단순 무작위 뽑기가 아닌 셔플이기때문에 중복된 숫자는 없다.
				int tmp = lotto [i]; // tmp에 lotto 배열 첫번째에 지정된 숫자 저장. (15로 잡자, tmp는 1이 된다.)
				lotto[i] = lotto[num];// lotto[num] = 출력하기 위해 랜덤으로 나온 값을 i에 저장, 15라고 치자
				lotto[num] = tmp; // 15랑 1을 바꾼다
				
// lotto[i-1] :  >1<     2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17   : 15 당첨
// lotto[i-1]     15     2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17   : 1과 15를 바꿔줌
// lotto[i-2]    출력   >2< 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17	: 4 당첨... 반복		
//               (15)
			}

			System.out.println("이번주 로또 번호는 : ");
			for (int i = 0; i<6; i ++)
				System.out.print(lotto[i] + ",");
	
	}
		
	}
	


