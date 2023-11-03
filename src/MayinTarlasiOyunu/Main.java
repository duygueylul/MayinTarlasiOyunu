package MayinTarlasiOyunu;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Mayın Tarlasına Hoşgeldiniz!");
		System.out.println("Lütfen Başlamak İstediğiniz Boyutları Seçiniz: ");
		System.out.print("Satır Sayısı: ");
		row = scan.nextInt();
		System.out.println("Sütun Sayısı: ");
		column = scan.nextInt();
		
		
		MayinTarlasi mayin = new MayinTarlasi(2,2); // nesne oluşturuldu.
		mayin.run();
	}

}
