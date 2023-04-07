package java_20230405;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 85.4;
		int score = 10;
		
		d = score; // 더블, 실수형이므로 10.0 (d = (double)score(d);
		System.out.println(d);
		d=85.4;
		
		score =(int)d;
		System.out.println(score);
		
		short sh = 32767;
		int num = 10000;
		sh = (short)num;
		System.out.println(sh);
		
		System.out.println((double)5/2 );
		
		System.out.println();

	
	}

}
