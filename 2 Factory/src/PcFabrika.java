
public class PcFabrika {

	
	public static Bilgisayar getBilgisayar(String marka, String islemci, String ekrankart, int ram, double ekran) {

		Bilgisayar bilgisayar;

		if("Hp".equalsIgnoreCase(marka)) { //marka hp ise oluþacak.
			
			bilgisayar = new Hp(marka, islemci, ekrankart, ram, ekran);
			
		}
		else if("Asus".equalsIgnoreCase(marka)) { //marka Asus ise oluþacak.
			
			bilgisayar = new Asus(marka, islemci, ekrankart, ram, ekran);
		}
		else {
			throw new RuntimeException("Geçerli bir model deðildir."); //sout yerine bu yazým uyarý oluþturmak için kullanýlýyor. 
		}
		
		
		return bilgisayar;
	}
}
