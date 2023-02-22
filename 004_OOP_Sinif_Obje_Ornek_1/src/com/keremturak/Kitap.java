package com.keremturak;

public class Kitap {
	
	
	//static değişken
	public static String urunTipi="kütüphane";
	//
	//Sinif üye değişkenleri
	public String ad;
	public int sayfaSayisi;
	public String yazarAdi;
	public int stokMiktari;
	
	public String kitapBilgileriniGetir() {
		String kitapBilgileri = ("ad "+ad+" sayfa sayisi "+ sayfaSayisi+" yaza adi: "+ yazarAdi+" stok miktai "+stokMiktari+"  "+Kitap.urunTipi );
		return kitapBilgileri;
	}
	

}
