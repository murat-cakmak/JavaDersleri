// Scanner ve File komu ile txt dosyasının içeriğini okuyoruz.

import java.util.Scanner;
import java.io.*;
public class ScannerFileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File date = new File("file.txt");
		Scanner file = new Scanner(date);
		
		while(file.hasNext()){
			System.out.println(file.nextLine());
		}
	}
}
