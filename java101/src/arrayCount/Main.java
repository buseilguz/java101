package arrayCount;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		System.out.println("Kaç elemanlý bir dizi istiyorsunuz?");
		int n=scn.nextInt();
		//Kulanýcýdan alýnan sayýya göre dizi tanýmlanýr.
		int[] array=new int[n];
		System.out.println("Dizinin elemanlarýný giriniz.");
		for (int i=1;i<=array.length;i++) {
			System.out.println("Dizinin " + i +". elemaný : ");
			array[i-1]=scn.nextInt();
		
		}
        int count=0;

        Arrays.sort(array); // Dizideki elemanlarý küçükten büyüðe sýrala

        for(int i=0; i<array.length; i++)
        {
            count=0;
            for (int j=0; j<array.length; j++)
            {
                if(array[i]==array[j])
                {
                    count++;

                }
            }

            if(i==0 && array[i+1]==array[i])
            {
System.out.println(String.format("%d sayýsý %d defa tekrar edilmiþ.", array[i], count));
            }

            if(i==0 && array[i+1]!=array[i])
            {
System.out.println(String.format("%d sayýsý %d defa tekrar edilmiþ.", array[i], count));
            }


     /* dizideki elemanlar küçükten 
		büyüðe sýralandýðýndan kendinden
 		bir önceki eleman ya aynýdýr ya 
		farklýdýr eðer ayný ise bu elemaný tekrar sayma.*/

            if(i!=0 && array[i-1]!=array[i]) 
            {
System.out.println(String.format("%d sayýsý %d defa tekrar edilmiþ.", array[i], count));
            }

        }

	}

}
