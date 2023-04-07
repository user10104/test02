package ch2;

public class floattest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double f = 0.1 +  0.1 +  0.1 +  0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1f; 
		float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f; //f안붙이면 8byte로 저장
		System.out.println(f);
		
		double sum = 0;
		
		for(int 1 = 0; 1<30; 1++)
			sum = sum + 0.1;
		System.out.println(sum);
		
		float f1 = 2147483648f;
		float f2 = 2147483658f;
		float f3 = 2147483768f;

		System.out.println("%f/n");
		System.out.println("%f/n");
		System.out.println("%f/n");
		
		final int MAX_SPEED = 100;
	}

}
