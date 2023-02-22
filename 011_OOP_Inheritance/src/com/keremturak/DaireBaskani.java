package com.keremturak;

//Daire başkannı sınıfıda personel sınıfının bir alt sınıfıdır.(Daire başkanı sınıfı personel sınıfından türemiştir)
//(Personel sınıfı Daire başkanıı sınıfının super cllassıdır)
public class DaireBaskani extends Personel {

	private String makamAdi;
	private long telSeriNo;
	private Mudur[] baglimMudurler;
	
	
	
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
	}
	

}
