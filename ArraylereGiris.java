# JavaDersleri

import java.util.Scanner;
public class Array {
	public static void main(String[] Args){
		
		int a[];
		a = new int[10];
		int i = 0;
		int toplam = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(i<5)
		{
			System.out.println((i + 1) + ". sayıyı giriniz :");
			a[i] = sc.nextInt();
				
			i++;
		}
		for(int x = 0; x < 5; x++)
		{
			toplam = toplam + a[x];
		}
		System.out.println("Toplam :" + toplam);
		
		
	}
}
