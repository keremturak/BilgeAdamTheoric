package com.keremturak;

public class Secreter extends Personel {

	
	private long tel1SeriNo;
	private long tel2SeriNo;
	
	public Secreter(String ad, String soyad, String tcKimlik, int yas, int maas, int kidemBilgisi, long cepTelNo,long tel1SeriNo,long tel2SeriNo) {
		super(ad, soyad, tcKimlik, yas, maas, kidemBilgisi, cepTelNo);
		this.tel1SeriNo=tel1SeriNo;
		this.tel2SeriNo=tel2SeriNo;
	}
	
	public Secreter() {
		//gizli suepr() var buurada.
	}
	
	//alt sınıfın constructorları mutlaka üst sınıfın coonstructorunu çağırmak zorundadır.
	public Secreter(long tel1SeriNo) {
		super("merhaba",27);
		this.tel1SeriNo = tel1SeriNo;
		System.out.println("public Secreter(long tel1SeriNo) çağrıldı");
	}
	
	public long getTel1SeriNo() {
		return tel1SeriNo;
	}
	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}
	public long getTel2SeriNo() {
		return tel2SeriNo;
	}
	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}
	//method overriding
	public int getZamKatsayisi() {
		return 2 ;
	}


}
