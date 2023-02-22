package com.keremturak;

import java.util.Arrays;

//Daire başkannı sınıfıda personel sınıfının bir alt sınıfıdır.(Daire başkanı sınıfı personel sınıfından türemiştir)
//(Personel sınıfı Daire başkanıı sınıfının super cllassıdır)
public class DaireBaskani extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Mudur[] baglimMudurler;
	
	
	
	
	
	public DaireBaskani(String ad, String soyad, String tcKimlik,int yas,int maas,int kidemBilgisi, long cepTelNo, String makamAdi, long telSeriNo) {
		super();
		this.setAd(ad);
		this.setSoyad(soyad);
		this.setTcKimlik(tcKimlik);
		this.setYas(yas);
		this.setMaas(maas);
		this.setKidemBilgisi(kidemBilgisi);
		this.setCepTelNo(cepTelNo);
		this.makamAdi = makamAdi;
		this.telSeriNo = telSeriNo;
	}
	@Override
	public String toString() {
		return "DaireBaskani [getMakamAdi()=" + getMakamAdi() + ", getTelSeriNo()=" + getTelSeriNo()
				+ ", getBaglimMudurler()=" + Arrays.toString(getBaglimMudurler()) + ", getAd()=" + getAd()
				+ ", getSoyad()=" + getSoyad() + ", getTcKimlik()=" + getTcKimlik() + ", getYas()=" + getYas()
				+ ", getMaas()=" + getMaas() + ", getKidemBilgisi()=" + getKidemBilgisi() + ", getCepTelNo()="
				+ getCepTelNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getMakamAdi() {
		return makamAdi;
	}
	public void setMakamAdi(String makamAdi) {
		this.makamAdi = makamAdi;
	}
	public long getTelSeriNo() {
		return telSeriNo;
	}
	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}
	public Mudur[] getBaglimMudurler() {
		return baglimMudurler;
	}
	public void setBaglimMudurler(Mudur[] baglimMudurler) {
		this.baglimMudurler = baglimMudurler;
	}public int getZamKatsayisi() {
		return 8 ;
	}
	

}
