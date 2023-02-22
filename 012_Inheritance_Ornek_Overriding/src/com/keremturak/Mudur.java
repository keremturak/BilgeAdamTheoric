package com.keremturak;

public class Mudur extends Personel {

	private long telSeriNo;
	private Muhendis[] bagliMuhendisler;
	

		
//		this.setAd(ad);
//		this.setSoyad(soyad);
//		this.setTcKimlik(tcKimlik);
//		this.setYas(yas);
//		this.setMaas(maas);
//		this.setKidemBilgisi(kidemBilgisi);
//		this.setCepTelNo(cepTelNo);
//		this.telSeriNo = telSeriNo;
	//yukarıdaki kodların yerine üst sınıfın constructorunu çağır.
	public Mudur(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		// TODO Auto-generated constructor stub
	}
	
	


	

	
	
	public long getTelSeriNo() {
		return telSeriNo;
	}
	public Mudur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mudur(String s, int y) {
		super(s, y);
		// TODO Auto-generated constructor stub
	}
	
	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}
	public Muhendis[] getBagliMuhendisler() {
		return bagliMuhendisler;
	}
	public void setBagliMuhendisler(Muhendis[] bagliMuhendisler) {
		this.bagliMuhendisler = bagliMuhendisler;
	}
	//method overriding
	public int getZamKatsayisi() {
		return 5 ;
	}

}
