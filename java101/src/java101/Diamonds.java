package java101;
import java.util.Scanner;
public class Diamonds {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.println("Bir Sayý Giriniz :");
	        int n = scn.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int k = 1; k <= (n - i); k++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= ((2 * i) - 1); j++) {
	                System.out.print("*"); //First line stars
	            }
	            System.out.println("");

	        }
	        for (int i = 1; i<n; i++){
	            for (int k = 1; k<=(n-(n-i)); k++){
	                System.out.print(" "); //spaces
	            }
	            for (int j=(((2*n)-3)-((2 * i) - 1)) ; j>=0; j--){
	                System.out.print("*"); //second line stars
	            }

	            System.out.println("");
	        }
	    }
	        


	    }
	


