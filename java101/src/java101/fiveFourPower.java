package java101;
import java.util.Scanner;
public class fiveFourPower {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int n;
		System.out.println("Sýnýr sayýsýný giriniz.");
		n=scn.nextInt();
		for(int i=1;i<=n;i*=4) {
			System.out.println("Dördün kuvveti : " +i);
		}
		for(int i=1;i<=n;i*=5) {
			System.out.println("Beþin kuvveti : " +i);
		}
	}

}
