package java101;
import java.util.Iterator;
import java.util.Scanner;
public class dividedNumbers {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);		
		int number;
		int total =0;
		int counter=0;
		System.out.println("Sayýyý giriniz.");
		number=scn.nextInt();
		for(int i = 0;i<number;i++) {
			if(i%3==0 && i%4==0) {
				total=total+i;
				counter++;
			}
		}
		System.out.println("3 ve 4'e tam bölünen sayýlarýn ortalamasý:" + (total/counter));
	}

}
