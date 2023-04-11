package java_20230411;

public class Exam_04 {

	/*
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 */
	
	public static void main(String[] args) {
		
		
		for(int i=0 ;i<5;i++) {
			for(int j=0 ; j<4-i ; j++) { //0으로 시작해서 5번의 스페이스(공백)을 찍으려면 4까지만 반복해야하므로
		System.out.print(" ");
			}
		
		
			for(int j=0 ; j<5-(4-i) ; j++) { //괄호 위치, 수 주의
				System.out.print("+"); //5에서 빼줘야함
		
		}
		System.out.println(""); 
	}
}
}
//exam01{
//(string[]arg){
//for(int i=0; i<5; i++) {
	//for(int j=0; j<5; j++) {
		//if(j<4-1)
	//		System.out.println(" ");
		//else
			//System.out.println("+");
	//}
//}   System.out.println(); 
//}

//}
//}