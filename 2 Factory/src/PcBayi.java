
public class PcBayi {


	public static void main(String[] args) {
		//	public Asus(String marka, String islemci, String ekrankart, int ram, double ekran) {
		//Bilgisayar Hp = PcFabrika.getBilgisayar(marka: "Hp",islemci: "i7",ekrankart: "Nvidia",ram: 16,ekran: 17.3);
		//PcFabrika.getBilgisayar(marka "Hp",islemci "i7",ekrankart "Nvidia",ram 16,ekran 17.3);
		
		Bilgisayar Hp = PcFabrika.getBilgisayar("Hp", "i7", "Nvidia", 16, 17.3); //Fabrikadan istenen ürün bilgileri.
		
		System.out.println("Hp özellikleri : "+ Hp);
		
		Bilgisayar Asus = PcFabrika.getBilgisayar("Asus", "i9", "Nvidia", 12, 15.6); 
		System.out.println("Asus özellikleri :" + Asus);
		
		Bilgisayar Casper = PcFabrika.getBilgisayar("Casper", "i5", "amd",15, 15.6);
		
		
		System.out.println("Casper özellikleri :" + Casper);              //**Hocaya sorulacak, geçersiz yazmak yerine programýn çalýþmasýný engelliyor.
	}
	
	
}
