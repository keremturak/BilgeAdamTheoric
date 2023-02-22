package com.keremturak;

public class Puzzle {

		
	//static değişken
	public static String urunTipi="Oyuncak";
	public String adi;
	public String marka;
	public int parcaSayisi;
	public int stokMiktari;
	
	public void bilgileriGetir() {
		System.out.println("Adı : "+ adi+" Marka : "+marka+" Parça sayısı : "+ parcaSayisi+" Stok Miktarı : "+ stokMiktari+" "+Puzzle.urunTipi);
		
	}public static void bilgileriGetir2() {
		
		System.out.println(urunTipi);
	}
	
	
	
	
}
