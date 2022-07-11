
public class HpFabrika implements BilgisayarFabrika{

	@Override
	public Bilgisayar getBilgisayar(String marka, String islemci, String ekrankart, int ram, double ekran) {

		return new Hp(marka, islemci, ekrankart, ram, ekran);
	}

	
}
