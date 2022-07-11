
public class PcFabrika {

	
	public static Bilgisayar getBilgisayar(String marka, String islemci, String ekrankart, int ram, double ekran) {

		Bilgisayar bilgisayar;

		if("Hp".equalsIgnoreCase(marka)) { //marka hp ise olu�acak.
			
			bilgisayar = new Hp(marka, islemci, ekrankart, ram, ekran);
			
		}
		else if("Asus".equalsIgnoreCase(marka)) { //marka Asus ise olu�acak.
			
			bilgisayar = new Asus(marka, islemci, ekrankart, ram, ekran);
		}
		else {
			throw new RuntimeException("Ge�erli bir model de�ildir."); //sout yerine bu yaz�m uyar� olu�turmak i�in kullan�l�yor. 
		}
		
		
		return bilgisayar;
	}
}
