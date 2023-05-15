package ex02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class SimpleWriter {

	public static void main(String[] args) throws IOException {
		String path = "c:/data/number.txt";
		
		Writer writer = new FileWriter(path);
		writer.write(path, 3,4);
		writer.close(); //다른 내용을 불러오려면 포함 세줄 주석처리.
		
		Reader read = new FileReader(path);
			while(true) {
			int ch = read.read();
			if(ch == -1) break;
			System.out.println((char)ch);
			
			
			}
	}

}
