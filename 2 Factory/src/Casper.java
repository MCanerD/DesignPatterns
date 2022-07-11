
public class Casper implements Bilgisayar{

	private String marka;
	private String islemci;
	private String ekrankart;
	private int ram;
	private double ekran;
	
	
	public Casper(String marka, String islemci, String ekrankart, int ram, double ekran) {
		this.marka = marka;
		this.islemci = islemci;
		this.ekrankart = ekrankart;
		this.ram = ram;
		this.ekran = ekran;
	}
	
	
	public String getMarka() {
		return marka;
	}
	public String getIslemci() {
		return islemci;
	}
	public String getEkrankart() {
		return ekrankart;
	}
	public int getRam() {
		return ram;
	}
	public double getEkran() {
		return ekran;
	}


	@Override
	public String toString() {			//Nesnenin string temsilini d�nd�r�r.			//ekranda bilgileri g�rmek i�in gerekli, bu olmadan ekran ��kt�s� problemli oluyor.
		return "Casper [Marka=" + marka + ", �slemci=" + islemci + ", Ekran kart�=" + ekrankart + ", Ram=" + ram
				+ ",Ekran Boyutu=" + ekran + "]";
	}

	
	
	
}