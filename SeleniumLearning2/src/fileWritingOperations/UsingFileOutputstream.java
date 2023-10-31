package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "UsingFos.txt";
		String content = "it is easy";

		FileOutputStream fos = new FileOutputStream(location);
		byte[] writethis = content.getBytes();
		fos.write(writethis);		
		fos.close();



























		//		FileOutputStream outputstream = new FileOutputStream(location);
		//
		//		byte[] writeThis = content.getBytes();
		//
		//		outputstream.write(writeThis);
		//
		//		outputstream.close();

	}

}
