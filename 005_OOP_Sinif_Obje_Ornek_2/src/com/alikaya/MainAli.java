package com.alikaya;

public class MainAli {

	public static void main(String[] args) {
		
		ParalelKenar paralelkenar1 = new ParalelKenar();
		paralelkenar1.kisaKenar=27;
		paralelkenar1.uzunKenar=40;
			
		Ucgen ucgen1 = new Ucgen();
		ucgen1.kenar1=10;
		ucgen1.kenar2=10;
		ucgen1.kenar3=20;
		System.out.println(ucgen1.ucgenCevresi());
		
		Ucgen ucgen2 = new Ucgen();
		
		ucgen2.kenar1=10;
		ucgen2.kenar2=15;
		ucgen2.kenar3=30;
		
		System.out.println(ucgen2.ucgenCevresi());
		
		ucgen1.kenarlariUzat(20);
		System.out.println(ucgen1.ucgenCevresi());
		Dairer daire = new Dairer();
		daire.yaricap=5;
		
		

	}

}
