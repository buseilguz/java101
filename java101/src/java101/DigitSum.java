package java101;
import java.util.Scanner;


public class DigitSum {
  
    public static void main(String[] args) {
      
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Bir Sayý Girin: ");
 
       
        int num = scn.nextInt();
 
        int n = 0,total=0;
 
        while(num != 0)
        {
           total=(num%10)+total;
           num /= 10;
            ++n;
        }
 
        System.out.println("Basamak Toplamý: " + total);
    } 
}