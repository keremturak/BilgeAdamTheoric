package com.keremturak;

public class Otomobil {
	public static String aracTipi = "kara aracı";
	
	//Otomobil sınıfından türetilebilecek her bir nesnenin sahip olabileceği özellikler
	
	public String marka;	//string nesnesi null olarak initialize edilir.
	public String model;
	public int yil;			//sayisal veri tipleri 0 olarak initialize edilir.
	public int aracinKm;
	public Motor motor;
	
	
	public void bilgileriEkranaYaz() {
		String marka = "BMW";//aşağıda ki markanın başına this yazmazsak ambuguity(kafa karışıklığı) oluşuyr
		System.out.println("Aracın markası : "+ this.marka + "-- Aracın modeli "+ this.model + "-- Aracın yılı "+yil +"-- Aracın kmsi "+aracinKm +" "+Otomobil.aracTipi);
		this.motor.motorBilgileriniYazdir();
		
		
	}public int araciSur(int km) {
		return aracinKm=aracinKm+km;
		
	}public void aracYılBilgisiDegistir(int yil) {
		this.yil = yil;
		System.out.println(this.yil);
	}
	
	

}
