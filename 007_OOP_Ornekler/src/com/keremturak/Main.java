package com.keremturak;

public class Main {

	public static void main(String[] args) {
		
		
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka= "Audi";
		otomobil1.model= "A3";
		otomobil1.yil= 2012;
		otomobil1.aracinKm=0;

		
		otomobil1.motor =new Motor();
		otomobil1.motor.motorHacmi=1400;
		otomobil1.motor.saseNo="5AU25454";
		otomobil1.motor.yakitTuketimi=7;
		
		otomobil1.motor.motorBilgileriniYazdir();
		

		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka= "Opel";
		otomobil2.model= "Astra";
		otomobil2.yil= 2017;
		otomobil2.aracinKm=5000;
		
		otomobil2.motor =new Motor();
		otomobil2.motor.motorHacmi=1000;
		otomobil2.motor.saseNo="5OJ895554";
		otomobil2.motor.yakitTuketimi=8;
		
		otomobil2.motor.motorBilgileriniYazdir();
		
		otomobil2.bilgileriEkranaYaz();
		
		otomobil2.araciSur(50000);
		otomobil2.bilgileriEkranaYaz();
		
		otomobil2.aracYılBilgisiDegistir(2021);
		otomobil2.bilgileriEkranaYaz();
		System.out.println();
		
		SUV jeep = new SUV();
		jeep.aracinKm=2000;
		jeep.marka="JEEP";
		jeep.model = "Range Rover";
		jeep.yil = 2000;
		jeep.motor = new Motor(); 
		jeep.motor.motorHacmi = 2000;
		jeep.motor.saseNo="JJ544564";
		jeep.motor.yakitTuketimi=11;
		jeep.bilgileriEkranaYaz();
		
		Motor m1 = new Motor();
		m1.motorHacmi=1500;
		m1.saseNo="sh545454";
		m1.yakitTuketimi=17;
		m1.motorBilgileriniYazdir();
		
		jeep.motor=m1;
		jeep.bilgileriEkranaYaz();
		
		System.out.println();
		
		Otomobil temp;
		temp = otomobil2;
		temp.motor.motorHacmi=1100;
		System.out.println(otomobil2.motor.motorHacmi);
		
		

	}

}
