package transpose;

import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s,t;
        int i, j;
        System.out.println("Oluþturulacak satýr sayýsýný gir");
        s = scn.nextInt();
        
        System.out.println("Oluþturulacak sütun sayýsýný gir");
        t = scn.nextInt();
        
        int[][] matrix = new int[s][t]; //girilen sayý kadar çok boyutlu dizi oluþturur.
        int[][] transpoz = new int[s][t];
        for (i = 0; i < s; i++) {
            for (j = 0; j < t; j++) {
                System.out.println((i + 1) + "x" + (j + 1) + "sayýyý gir");
                matrix[i][j] = scn.nextInt();
                transpoz[i][j] = matrix[i][j];
            }
        }
        System.out.println("Matris: ");
        for (i = 0; i < s; i++) {  //transpoz alýnmamýþ hali
            for (j = 0; j < t; j++) {
                System.out.print(matrix[i][j] + "\t");

            }

            System.out.println("");

        }
        System.out.println("Transpoze: ");

        System.out.println("");
        for (i = 0; i < s; i++) {
            for (j = 0; j < t; j++) {
                System.out.print(transpoz[j][i] + "\t"); //traspoz alýnmýþ hali

            }

            System.out.println("");

        }
      

    }

}