package ex01;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream; 
import java.io.DataOutputStream;
import java.io.FileInputStream;

public class ReadTointFile {

	public static void main(String[] args) throws IOException {

		String path=   "c:/data/data.dat";
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
		out.writeInt(35);
		out.writeDouble(3.14);
		out.close();
	
	}

}
