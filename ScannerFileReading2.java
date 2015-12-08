//info.txt de girilen sayıları toplayıp ortalamalarını bulur.

import java.io.*;
import java.util.Scanner;

public class ScannerFileReading2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File data = new File("info.txt");
		Scanner file = new Scanner(data);
		
		int numTimes = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < numTimes ; i++){
			int sum = 0;
			int count = 0;
			
			for(int x = 0; x < 4; x++){
				sum += file.nextInt();
				count++;
			}
			System.out.println("The average is : " + ((double) sum / count));
			
		}
	}
 
}
