package transpose;

import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s,t;
        int i, j;
        System.out.println("Olu�turulacak sat�r say�s�n� gir");
        s = scn.nextInt();
        
        System.out.println("Olu�turulacak s�tun say�s�n� gir");
        t = scn.nextInt();
        
        int[][] matrix = new int[s][t]; //girilen say� kadar �ok boyutlu dizi olu�turur.
        int[][] transpoz = new int[s][t];
        for (i = 0; i < s; i++) {
            for (j = 0; j < t; j++) {
                System.out.println((i + 1) + "x" + (j + 1) + "say�y� gir");
                matrix[i][j] = scn.nextInt();
                transpoz[i][j] = matrix[i][j];
            }
        }
        System.out.println("Matris: ");
        for (i = 0; i < s; i++) {  //transpoz al�nmam�� hali
            for (j = 0; j < t; j++) {
                System.out.print(matrix[i][j] + "\t");

            }

            System.out.println("");

        }
        System.out.println("Transpoze: ");

        System.out.println("");
        for (i = 0; i < s; i++) {
            for (j = 0; j < t; j++) {
                System.out.print(transpoz[j][i] + "\t"); //traspoz al�nm�� hali

            }

            System.out.println("");

        }
      

    }

}