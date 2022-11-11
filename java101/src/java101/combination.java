package java101;
import java.util.Scanner;
public class combination {

	public static void main(String[] args) {
		int N=1;
		int R=1;
		int NR=1;
		int C;
		Scanner scn=new Scanner(System.in);	
		System.out.println("N sayýsýný giriniz.");
		int n=scn.nextInt();
		System.out.println("r sayýsýný giriniz.");
		int r=scn.nextInt();
		for(int i =1;i<=n;i++) {
			N=N*i;
		}
		for(int j =1;j<=r;j++) {
			R=R*j;
		}
		for(int l =1;l<=(n-r);l++) {
			NR=NR*l;
		}
		C=N/(R*NR);
		System.out.println("Ýþlem sonucu : "+C);
	}

}
