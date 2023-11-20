package deneme30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// İdman oluşturma programı
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("İdman Oluşturma Programına Hoşgeldiniz");
		String idmanlar = "Burpee\n"
				+ "Pushup\n"
				+ "Situp\n"
				+ "Squat";
		System.out.println(idmanlar);
		System.out.println("İdman programınızı oluşturunuz...");
		
		System.out.print("Burpee Sayısı: ");
		int burpee=scanner.nextInt();
		System.out.print("Pushup Sayısı: ");
		int pushup=scanner.nextInt();
		System.out.print("Situp Sayısı: ");
		int situp=scanner.nextInt();
		System.out.print("Squat Sayısı: ");
		int squat=scanner.nextInt();
		
		
		scanner.nextLine();
		
		
		Idman idman = new Idman(burpee,pushup,situp,squat);
		
		System.out.println("İdmanınız Başlıyor...");
		
		while(idman.idmanBittiMi()==false) {
			System.out.print("Hareket Türü (Burpee,Pushup,Situp,Squat): ");
			String tur = scanner.nextLine();
			System.out.println("Kaç tane yaptınız:");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur,sayi);
			
		}
		System.out.println("İdmanını başarı ile sonlandırdın...");
		scanner.close();
		}	
	
	
	}
