package ex02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) throws IOException {

		String path=   "c:/data/data.dat";
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
		
		for(int i  = 0; i <=100; i++) {
			out.writeInt(i);
		}
		out.close();
	
}
		
}
	
