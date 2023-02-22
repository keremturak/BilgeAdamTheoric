package com.keremturak;

public class Muhendis extends Personel {

	private String uzmanlikAlani;
	

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
	

}
