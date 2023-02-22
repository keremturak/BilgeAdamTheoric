package com.keremturak;

public class Main {
	
	//INHERITANCE
	
	//Inheritance bir sınıfın üst sınıftan üye özellikleri ve metdoları miras almasınna denir.
	//Miras aldığı zaman alt sınfı üst sınıfın özelliklerini tıpkı kendisindeymişcesine kullanabilir.
	//Alt sınıf türetmek hiyerarşik yapıda olur.
	//Bir alt sınıfın türetildiği sınıf o alt sınıfın üst sınıfı(super classı) ollur.
	//Bir alt sınıfın sadece bir üst sınıfı olabilir.
	//Diğer dillerde bu farklılık gösterir.
	
	//Üst sınıfa ata(parent), alt sınıfa ise çocuk(child veya sub class) denir.
	
	

	public static void main(String[] args) {
//		Muhendis muhendis1 = new Muhendis();
//		muhendis1.setAd("Ali");
//		muhendis1.setSoyad("özkan");
//		muhendis1.setTcKimlik("1112546844");
//		muhendis1.setUzmanlikAlani("Elektrik elektronik mühendisi");
//		System.out.println(muhendis1.getAd()+ muhendis1.getSoyad()+muhendis1.getUzmanlikAlani());
//		
//		IdariMemur idarimemur = new IdariMemur();
//		idarimemur.setAd("Ali");
//		idarimemur.setSoyad("özkan");
//		idarimemur.setTcKimlik("1112546844");
//		System.out.println(idarimemur.getAd()+ idarimemur.getSoyad());
		
//		Muhendis muhendis2 = new Muhendis();
//		muhendis2.setAd("Ahmet");
//		muhendis2.setSoyad("Çalişkan");
//		muhendis2.setUzmanlikAlani("makine müh");
//		System.out.println(muhendis1.getAd()+ muhendis1.getSoyad()+muhendis1.getUzmanlikAlani());
		
		Muhendis m = new Muhendis();
		Secreter s = new Secreter();
		Secreter s2 = new Secreter(501);
		
		
	}

}
