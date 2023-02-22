package com.keremturak;

public class Main {

	public static void main(String[] args) {
		Kutu kutu1 = new Kutu();
		kutu1.hacim = 50 ;
		kutu1.kutununGiddeceğiAdres="ankara";
		
		Kutu kutu2 = new Kutu();
		kutu2.hacim = 50 ;
		kutu2.kutununGiddeceğiAdres="bursa";
		
		Kutu kutu3 = new Kutu();
		kutu3.hacim = 50 ;
		kutu3.kutununGiddeceğiAdres="istanbul";
		
		//int[] array= new int[3];
		Kutu[] dizi = new Kutu[3];
		//dizi[0].hacim=90; bu ifade yanlış olur çünkü heniz diziye nesnelerimizi atmadık
		dizi[0]=kutu1;
		dizi[0].hacim=90;
		System.out.println(dizi[0].hacim);
		System.out.println(kutu1.hacim);
		dizi[1]= new Kutu();
		dizi[1].hacim = 120;
		dizi[1].kutununGiddeceğiAdres="bursa";
		System.out.println(dizi[1].hacim);
		
		dizi[2]= new Kutu();
		dizi[2].hacim=2;
		
		if (dizi[2]==null) {
			System.out.println("dizinin 3 no lu elemanı null");
	
		}for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i].hacim);
			
		}for (Kutu i : dizi) {
			System.out.println(i.hacim);
			System.out.println(i.kutununGiddeceğiAdres);
			
		}
	}

}
