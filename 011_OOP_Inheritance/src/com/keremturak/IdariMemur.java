package com.keremturak;

//extends Personel ; IdariMemur sınıfı Personel sınıfının bir alt sınıfıdır.
//extends etmek miras almak/kalıtımla özelliklerini taşıyor anlamına gelir.
public class IdariMemur extends Personel {
	
	//görevi ve tel seri no sekreter sınıfına ait özeliklerdir. tüm personelin genel özellikleri neeğildir.
	
	private String gorevi;
	private long telSeriNo;
	
	
	public String getGorevi() {
		return gorevi;
	}
	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}
	public long getTelSeriNo() {
		return telSeriNo;
	}
	public void setTelSeriNo(long telSeriNo) {
		this.telSeriNo = telSeriNo;
	}
	

}
