package com.keremturak;

public class SUV {
	
	public String marka;	//string nesnesi null olarak initialize edilir.
	public String model;
	public int yil;			//sayisal veri tipleri 0 olarak initialize edilir.
	public int aracinKm;
	public String cekisSistemi;
	public Motor motor;
	
	public void bilgileriEkranaYaz() {
	
		System.out.println("Aracın markası : "+ this.marka + "-- Aracın modeli "+ this.model + "-- Aracın yılı "+this.yil +"-- Aracın kmsi "+aracinKm +" "+this.cekisSistemi);
		this.motor.motorBilgileriniYazdir();
		System.out.println();
	
	}
}
