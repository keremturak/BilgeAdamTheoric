package com.keremturak;

//SINIF; CLASS (TASARIM)

public class Anahtar {
	
	//Sınıf static değişken
	//Static değişkenler nesneye özgü değil sınıfa özgüdür. her bir nesne için ayrı değer tutulmaz.
	
	public static int boy =10;//sınıfa ait ortak özellik
	
	//Özellik/Üye değişkenleri
	public String renk;
	public int no;
	public String ad;
	
	
	public static void uzunluguEkranaYaz() {
		
		System.out.println(Anahtar.boy);
		
		//static metotlar içinde static olmayan değişkenler kullanılmaz.
	}
		
	public void uzunluguEkranaYaz2() {
		System.out.println(Anahtar.boy);
		}
	
	//non-static üye metod
	
	public void bilgileriEkranaYaz() {
		System.out.println("renk: "+ renk+" no "+no+" ad "+ ad);
		
	}
	
	

}
