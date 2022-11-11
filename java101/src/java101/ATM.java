package java101;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String userName,password;
		boolean loginSuccess=false;
		int right=3;
		int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanýcý Adýnýz :");
            userName = scn.nextLine();
            System.out.print("Parolanýz : ");
            password = scn.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
                do {System.out.println("1-Para yatýrma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çýkýþ Yap");
                 System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                 select = scn.nextInt();
                 switch (select) {
				case 1:
					  System.out.print("Para miktarý : ");
                      int price = scn.nextInt();
                      balance += price;
					break;

				case 2:
					 System.out.print("Para miktarý : ");
                     int price1 = scn.nextInt();
                     if (price1 > balance) {
                         System.out.println("Bakiye yetersiz.");
                     } else {
                         balance -= price1;
                     }
					break;
				case 3:
					 System.out.println("Bakiyeniz : " + balance);
					break;
				
					}
		
                
                }while (select == 4);
                System.out.println("Tekrar görüþmek üzere.");
                break;
                
            }else {
                right--;
                System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkýnýz : " + right);
                }
        }
	}	
	}}
