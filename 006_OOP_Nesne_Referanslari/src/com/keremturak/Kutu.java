package com.keremturak;

public class Kutu {
	
	public int hacim;
	public String kutununAdi;
	public String kutununSahibi;
	public String kutununGiddeceğiAdres;
	
	public void degistir(int sayi) {
		hacim = sayi;
	}
	public void degistir2(int sayi) {
		sayi =sayi*sayi;
		
	}

	public static void main(String[] args) {
		
		Kutu kutu1 =new Kutu();
		kutu1.kutununGiddeceğiAdres="ankara";
		kutu1.hacim=20;
		System.out.println(kutu1.hacim);
		kutu1.degistir(15);
		System.out.println(kutu1.hacim);
		
		Kutu kutu2 =new Kutu();
		kutu2.kutununGiddeceğiAdres="bursa";
		kutu2.hacim=30;
		System.out.println(kutu1.hacim);

		
//		int s =5;
//		kutu1.degistir2(s);
//		System.out.println(s);//bir değişiklik olmaz..
		
//		Kutu kutu2;
//		kutu2 = kutu1;
//		kutu2.degistir(40);
//		System.out.println(kutu1.hacim);
		
	}

}
