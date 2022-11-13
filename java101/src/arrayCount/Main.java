package arrayCount;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		System.out.println("Ka� elemanl� bir dizi istiyorsunuz?");
		int n=scn.nextInt();
		//Kulan�c�dan al�nan say�ya g�re dizi tan�mlan�r.
		int[] array=new int[n];
		System.out.println("Dizinin elemanlar�n� giriniz.");
		for (int i=1;i<=array.length;i++) {
			System.out.println("Dizinin " + i +". eleman� : ");
			array[i-1]=scn.nextInt();
		
		}
        int count=0;

        Arrays.sort(array); // Dizideki elemanlar� k���kten b�y��e s�rala

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
System.out.println(String.format("%d say�s� %d defa tekrar edilmi�.", array[i], count));
            }

            if(i==0 && array[i+1]!=array[i])
            {
System.out.println(String.format("%d say�s� %d defa tekrar edilmi�.", array[i], count));
            }


     /* dizideki elemanlar k���kten 
		b�y��e s�raland���ndan kendinden
 		bir �nceki eleman ya ayn�d�r ya 
		farkl�d�r e�er ayn� ise bu eleman� tekrar sayma.*/

            if(i!=0 && array[i-1]!=array[i]) 
            {
System.out.println(String.format("%d say�s� %d defa tekrar edilmi�.", array[i], count));
            }

        }

	}

}
