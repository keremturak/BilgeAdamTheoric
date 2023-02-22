package com.keremturak;

public class Main {

	public static void main(String[] args) {
		
		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk ="mavi";
		anahtar1.no=10;
		anahtar1.ad = "Benim anahtarım";
		System.out.println("ad "+anahtar1.ad+ " "+ "renk "+anahtar1.renk+" "+"no " + anahtar1.no+"boy "+ Anahtar.boy);
		
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk ="kırmızı";
		anahtar2.no=11;
		anahtar2.ad = "Kardeşimin anahtarım";
		System.out.println("ad "+anahtar2.ad+ " "+ "renk "+anahtar2.renk+" "+"no " + anahtar2.no+ "boy "+Anahtar.boy);
		
		///static üye metodu
		
		
		System.out.println("****\n");
		
		
		//static bir metodu kullanırken sınıf adı. metod adı yazılır
		Anahtar.uzunluguEkranaYaz();
		
		//non-static bir metod kullanılırken nesneadı.metod yazılır. çünkü bu nesneye özgüdür..
		anahtar1.bilgileriEkranaYaz();
		
		// peki şu şekilde yazılabilir mi?
		
//		Anahtar.bilgileriEkranaYaz();//yazılamaz.. çünkü static değildir. Neesne adı ile çağırılabilir.
		
		
		//Nesnelerden oluşan diziler
		
		int[] sayilarDizisi = {2,5,9,12};
		System.out.println(sayilarDizisi[0]);
		
		Anahtar[] anahtarDizisi = {anahtar1, anahtar2};
		for (int i = 0; i < anahtarDizisi.length; i++) {
			System.out.println(anahtarDizisi[i].ad);
			
		}
		
		Anahtar[] anahtarDizisi2 = {anahtar1, anahtar2};
		for (int i = 0; i < anahtarDizisi.length; i++) {
			anahtarDizisi2[i].bilgileriEkranaYaz();
			
			
			System.out.println();
		}Anahtar[] anahtarDizisi3 = {anahtar1, anahtar2};
		for (Anahtar anahtar : anahtarDizisi3) {
			anahtar.bilgileriEkranaYaz();
			
		}
		
		
		

		
	}


}
