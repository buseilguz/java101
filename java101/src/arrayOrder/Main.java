package arrayOrder;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		System.out.println("Ka� elemanl� bir dizi istiyorsunuz?");
		int n=scn.nextInt();
		//Kuulan�c�dan al�nan say�ya g�re dizi tan�mlan�r.
		int[] array=new int[n];
		System.out.println("Dizinin elemanlar�n� giriniz.");
		for (int i=1;i<=array.length;i++) {
			System.out.println("Dizinin " + i +". eleman� : ");
			array[i-1]=scn.nextInt();
		
		}
		//Dizi s�ralan�r ve yazd�r�l�r.
		Arrays.sort(array);
		System.out.println("S�ralama : "+Arrays.toString(array));
		
		
	}

}
