package java101;
import java.util.Scanner;
public class EbobEkok {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("1.sayýyý giriniz.");
		int n1=scn.nextInt();
		System.out.println("2.sayýyý giriniz.");
		int n2=scn.nextInt();
		int ebob=1,ekok,k=2;
		while (k<=n1&& k<=n2) {
			if(n1%k==0 && n2%k==0)
			{
				ebob=k;
			}
			k++;
		}
		ekok=(n1*n2)/ebob;
		System.out.println("EBOB("+n1+","+n2+") ="+ebob);
		System.out.println("EKOK("+n1+","+n2+") ="+ekok);
	}

}
