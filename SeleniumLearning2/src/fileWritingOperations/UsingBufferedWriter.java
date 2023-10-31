package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		String location = "usingbuffereedwriter.txt";
		String content = "this is it is ";
		
		FileWriter filewriter = new FileWriter(location);
		BufferedWriter buffered = new BufferedWriter(filewriter);
		
		buffered.write(content);
		buffered.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String location = "UsingBufferedWriter.txt";
		//		String content = "Learning java is easy";
		//		
		//		FileWriter filewriter = new FileWriter(location);
		//		
		//		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		//		bufferedwriter.write(content);
		//		bufferedwriter.close();

	}

}
