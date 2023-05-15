package ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NewBufferReader {

	public static void main(String[] args) throws IOException {

		String path = "c/data/number.txt";
		
		
		BufferedReader buffer = new BufferedReader(new FileReader(path));
		String line;
		
		while((line = buffer.readLine()) !=null) {
			System.out.println(line);
		}
		buffer.close();
		
	}

}
