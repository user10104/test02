
public class Exam01 {

	public static void main(String[] args) {

	String[]arr = {"kor","200","300"};
	
	for(int i=0; i<arr.length+1; i++){//length+1이니 for문이 4번돌고있기에 finally의 메시지가 4번 출력됨
			try{
				int value = Integer.parseInt(arr[i]);
				System.out.println(value);
	
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열 크기를 벗어났습니다.");
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("숫자가 아닌 문자는 숫자로 변환 불가 합니다.");
		}catch(Exception e) {
			System.out.println("모든 예외 처리"); //엑셉션이 위에 오면안됨
		}finally {
			System.out.println("예외가 발생하든 발생하지 않든 무조건 처리해야하는 메시지는 여기다가 기입한다.");
		}
			
			
	}
System.out.println("Program Off");
	}
}