package com.keremturak;

public class Main {
	
	//POLYMORPHİSM--ÇOK BİÇİMLİLİK 
	
	//BİR NESNE REFERANSININ YADA DEĞİŞKENİN FARKLI NESNELER GİBİ DAVRANA BİLMESİDİR.
	public static void yeniMaasiHesapla(Personel personel) {
		System.out.println(personel.getzamKatsayisi()*personel.getMaas());
	}
	/*
	public static void yeniMaasiHesapla(Muhendis muhendis) {
		System.out.println(muhendis.getZamKatsayisi()*muhendis.getMaas());
	}public static void yeniMaasiHesapla(Secreter secreter) {
		System.out.println(secreter.getZamKatsayisi()*secreter.getMaas());
	}public static void yeniMaasiHesapla(Mudur mudur) {
		System.out.println(mudur.getZamKatsayisi()*mudur.getMaas());
	}*/

	public static void main(String[] args) {
		Muhendis m = new Muhendis("Ali","Emre","1111",40,32000,3,5324558554546L,"Yazılım mühendisi");
		Main.yeniMaasiHesapla(m);
		Secreter s = new Secreter("Zeynep","Taş","2222",25,12000,7,532554,11,112);
		Main.yeniMaasiHesapla(s);
		
	}

}
