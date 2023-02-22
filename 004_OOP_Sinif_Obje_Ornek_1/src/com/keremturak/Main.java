package com.keremturak;

public class Main {

	public static void main(String[] args) {
		System.out.println(Kitap.urunTipi);// class değişkenleri yani static değişkenler new lamadan da yazdırılabilir/kullanıulabilir.
	//	System.out.println(kitap1.urunTipi);//bu şekilde yazılamaz ama henüz nesne oluşturulmadı
		Kitap kitap1 = new Kitap();//new kelimesi ile memoryden yer tahsis edilir..
		
		kitap1.ad="istanbul hatırası";
		kitap1.sayfaSayisi=225;
		kitap1.yazarAdi="Ahmet Ümit";
		kitap1.stokMiktari=500;
		System.out.println(kitap1.ad);
		System.out.println(kitap1.kitapBilgileriniGetir());
		
		System.out.println();
		Kitap kitap2 = new Kitap();
		kitap2.ad="1453";
		kitap2.sayfaSayisi=360;
		kitap2.stokMiktari=20;
		kitap2.yazarAdi="İskender Pala";
		System.out.println(kitap2.ad);
		System.out.println(kitap2.kitapBilgileriniGetir());
		System.out.println();
		System.out.println(Kitap.urunTipi);
		System.out.println();
		
		Puzzle puzzle1 =new Puzzle();
		puzzle1.adi="eyfel Kulesi";
		puzzle1.marka = "Ravens Burger";
		puzzle1.parcaSayisi=1500;
		puzzle1.stokMiktari=100;
		puzzle1.bilgileriGetir();

		
		
		
		

	}

}
