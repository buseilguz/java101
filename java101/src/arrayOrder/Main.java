package arrayOrder;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		System.out.println("Kaç elemanlý bir dizi istiyorsunuz?");
		int n=scn.nextInt();
		//Kuulanýcýdan alýnan sayýya göre dizi tanýmlanýr.
		int[] array=new int[n];
		System.out.println("Dizinin elemanlarýný giriniz.");
		for (int i=1;i<=array.length;i++) {
			System.out.println("Dizinin " + i +". elemaný : ");
			array[i-1]=scn.nextInt();
		
		}
		//Dizi sýralanýr ve yazdýrýlýr.
		Arrays.sort(array);
		System.out.println("Sýralama : "+Arrays.toString(array));
		
		
	}

}
