package ex05;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Exam06 {
	
	public static void main(String[] args)throws IOException{

		String filePath = "C:/data/sample.txt"; // 	읽어올 파일 경로
		String filePath2 = "C:/data/data.txt";	//	읽어올 파일 경로2
		BufferedReader reader = null;			//
		BufferedWriter writer = null;			//
		try {
			reader = new BufferedReader(new FileReader(filePath));
			writer = new BufferedWriter(new FileWriter(filePath2));
			String line = null;
		
		while((line = reader.readLine())!=null) {
			System.out.println(line); // 주석처리안하면 결과에 내욜 출력
//			System.out.println(line+"\r\n");
			writer.write(line+"\r\n");
			
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
		
		}
		
		
	}
}
		
	