
public class Asus implements Bilgisayar{

	private String marka;
	private String islemci;
	private String ekrankart;
	private int ram;
	private double ekran;
	
	
	public Asus(String marka, String islemci, String ekrankart, int ram, double ekran) {
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
	public String toString() {			//Nesnenin string temsilini döndürür.			//ekranda bilgileri görmek için gerekli, bu olmadan ekran çýktýsý problemli oluyor.
		return "Asus [Marka=" + marka + ", Ýslemci=" + islemci + ", Ekran kartý=" + ekrankart + ", Ram=" + ram
				+ ",Ekran Boyutu=" + ekran + "]";
	}

	
	
	
}