package ex04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//텍스트 파일 내 내용 출력
public class Exam05 {

	public static void main(String[] args) throws IOException{
		
			String filePath = "C:/data/sample.txt"; // 읽어올파일 경로
	
			try {BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			
			while ((line = reader.readLine()) !=null) {
				System.out.println(line);
			}
			
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//자동 종료
		}
	}		
}

