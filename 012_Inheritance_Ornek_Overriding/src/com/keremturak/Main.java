package com.keremturak;

public class Main {
	//metod overloading--METOT AŞIRI YÜKLENMESİ
	public static int topla(int x,int y) {
		
		return(x+y);
	}
	public static int topla(int x,int y,int z) {
		
		return(x+y+z);
	}
	
	

	public static void main(String[] args) {
		DaireBaskani daireBaşkani1 = new DaireBaskani("Ali", "Veli", "111222555", 50, 3000, 1, 50, "Daire Başkanı", 25);
		System.out.println(daireBaşkani1.toString());
		Muhendis m1 = new Muhendis("Mahmut", "Kara", "119922555", 30, 3600, 1,45,"Mühendis");
		System.out.println(m1.toString());
		System.out.println(m1.getZamKatsayisi());//ZAM KATSAYISI OLAYINDA İSE OVERRİDİNG YAPILMIŞTIR.
		System.out.println(daireBaşkani1.getAd()+" "+daireBaşkani1.getZamKatsayisi());
	
	}

}
