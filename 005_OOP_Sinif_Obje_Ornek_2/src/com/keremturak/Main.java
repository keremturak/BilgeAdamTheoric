package com.keremturak;

import com.alikaya.Ucgen;


public class Main {

	public static void main(String[] args) {
		
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar=7;
		dikdortgen1.uzunKenar = 10;
		System.out.println(dikdortgen1.alanHesala());
		
		Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar=8;
		dikdortgen2.uzunKenar = 4;
		System.out.println(dikdortgen2.alanHesala());
		System.out.println();
		dikdortgen2.kisaKenar=25;
		System.out.println(dikdortgen2.alanHesala());
		System.out.println();
		Kare kare1 = new Kare();
		kare1.kenar=4;
		System.out.println(kare1.alanHesapla());
		
		Kare kare2 = new Kare();
		kare2.kenar=5;
		System.out.println(kare2.alanHesapla());
		
		//Alinin parelel kenar sınıfını kullanabiir miyiz?
		
		//ParalelKenar parelelkenar1 =new ParalelKenar();
		
		
		//KULLANILMAZ SINIF DEĞİŞKENLERİNİN BAŞINA PUBLİC YAZILMADAN BOş BIRAKILIIRSA BU PROTECTED OLUR DEFAULT OLARAK
		//ÖRRN ::: İNT KİSAKENAR; ==> BU PROTECTED
		//PUBLİC İNT KİSAKENAR; ==>OLSAYDI KULLANILIRDI
		Ucgen ikizkenarUcgen = new Ucgen();
		ikizkenarUcgen.kenar1=10;
		ikizkenarUcgen.kenar2=10;
		ikizkenarUcgen.kenar3=20;
		System.out.println(ikizkenarUcgen.ucgenCevresi());
				

	}

}
