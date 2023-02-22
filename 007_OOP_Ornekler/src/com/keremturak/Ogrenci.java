package com.keremturak;

public class Ogrenci {
	
	public int ogrenciNo;
	public String ad;
	public String soyad;
	public OgrenciIletisim ogreciiletisim;
	
	
	





@Override
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + ", ad=" + ad + ", soyad=" + soyad + ", ogreciiletisim="
				+ ogreciiletisim + "]";
	}








public static void main(String[] args) {
	
	Ogrenci ogrenci1 = new Ogrenci();
	ogrenci1.ad="ALi";
	ogrenci1.ogrenciNo=100;
	ogrenci1.soyad="mercan";
	ogrenci1.ogreciiletisim=new OgrenciIletisim();
	ogrenci1.ogreciiletisim.adress="yeni mah";
	ogrenci1.ogreciiletisim.telNo= 90544468L ;
	
//	System.out.println(ogrenci1.toString());
	//toString metodu kullanımı = syso içine nesne adını yazarsak otomatik olarak toString meotdunu çalıştırıd
//	System.out.println(ogrenci1);
	
	Ogrenci ogrenci2 = new Ogrenci();
	ogrenci2.ad="Zeynep";
	ogrenci2.ogrenciNo=101;
	ogrenci2.soyad="Çalışkan";
//	System.out.println(ogrenci2);
	
	Ogrenci[] dizi = new Ogrenci[2];
	dizi[0]=ogrenci1;
	dizi[1]=ogrenci2;
	for (Ogrenci ogrenci : dizi) {
		System.out.println(ogrenci);
	}
	
	//Soru Siz yapın
	//Ogrenci nesnelerinden oluşan bir dizi oluşturun
	//diziye sırasıyla ogrenci1 ogrenci2 ve ogrenci3u içerik olarak atın
	//for each ile yazdırın.
	
}
}
