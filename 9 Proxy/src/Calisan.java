
public class Calisan {

	private String kullaniciAdi;
	private String sifre;
	private boolean isYonetici;
	
	public Calisan(String kullaniciAdi, String sifre, boolean isYonetici) {
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
		this.isYonetici = isYonetici;
	}
	
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public boolean isYonetici() {
		return isYonetici;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public void setYonetici(boolean isYonetici) {
		this.isYonetici = isYonetici;
	}
	
}
