package java101;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int n;
		int total=0;
		 
		do {
			System.out.println("Sayý giriniz.");
			n=scn.nextInt();
			if(n%4==0) {
				total=total+n;
			}
			
		}while(n%2==0);
		System.out.println("4'ün katý olan sayýlarýn toplamý: " + total);
	}

}
