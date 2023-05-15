package ex02;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Test02 {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.data";
		
		Writer out = new FileWriter(path);
		
		for(int i = 0; i<100; i++) {
			String data = Integer.toString(i);
			out.write(data);
			
			
		}
		out.close();
		
	}

}
