package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "UsingbuffereedWriter.txt";
		
		FileReader filereader = new FileReader(location);
		BufferedReader buffered = new BufferedReader(filereader);
		
		String currentLine;
		
		while((currentLine=buffered.readLine())!=null) {
			
			System.out.println(currentLine);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		FileReader filereader = new FileReader(location);
//		BufferedReader buffered = new BufferedReader(filereader);
//		
//		String currentLine ;
//		
//		while((currentLine=buffered.readLine())!=null) {
//		
//			System.out.println(currentLine);
//		
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		FileReader filereader = new FileReader(location);
//		
//		BufferedReader bufferedreader = new BufferedReader (filereader);
//		
//		String currentLine;
//		
//		while((currentLine = bufferedreader.readLine())!=null) {
//			
//			System.out.println(currentLine);
//		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		FileReader filereader = new FileReader(location);
//		BufferedReader reader = new BufferedReader(filereader);
//		String currentLine=reader.readLine();




//		while((currentLine=reader.readLine())!=null) {
//			System.out.println(currentLine);

		}

	}
