
public class AsusFabrika implements BilgisayarFabrika {

	@Override
	public Bilgisayar getBilgisayar(String marka, String islemci, String ekrankart, int ram, double ekran) {

		return new Asus(marka, islemci, ekrankart, ram, ekran);
	}

	
	
}
