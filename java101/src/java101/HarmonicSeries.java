package java101;
import java.util.Scanner;
public class HarmonicSeries {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.println("N say�s�n� giriniz");
		 int n=scn.nextInt();
		 double result=0.0;
		 for(double i=1;i<=n;i++) {
			 
			 result+= (1/i);
		 }
		 System.out.println(n+ " de�erinin harmonik ortalamas� : "+result);
	}

}
