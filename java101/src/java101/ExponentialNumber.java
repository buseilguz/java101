package java101;

import java.util.Scanner;
public class ExponentialNumber {

	public static void main(String[] args) {
		int total=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("�ss� al�nacak say�y� giriniz");
		
		int n=scn.nextInt();
		System.out.println("�ss� giriniz");
		
		int u=scn.nextInt();
		for(int i=1;i<=u;i++) {
			total*=n;
		}
		System.out.println("Sonu� : "+total);
	}

}
