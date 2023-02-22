package com.keremturak;

public class Muhendis extends Personel {
	
	private String uzmanlikAlani;

	public Muhendis(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,String uzmanlikAlani) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.uzmanlikAlani=uzmanlikAlani;
	}

	





	@Override
	public String toString() {
		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad()
				+ ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas() + ", getMaas()=" + getMaas()
				+ ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()=" + getCepTelNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}







	public Muhendis() {
		//super();//Üst sınnıfın consturctor (yapıcı metodu) demektir.
		//biz super() yazmasakta java otomatik olarak buraya ekler.
	}
	
	public String getUzmanlikAlani() {
		return uzmanlikAlani;
	}
	public void setUzmanlikAlani(String uzmanlikAlani) {
		this.uzmanlikAlani = uzmanlikAlani;
	}
	//method overriiding
	public int getZamKatsayisi() {
		return 4 ;
	}
	

}
