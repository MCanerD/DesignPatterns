
public class PcBayi {

	public static void main(String[] args) {
		
		HpFabrika hpFabrika = new HpFabrika();
		Bilgisayar Hp = hpFabrika.getBilgisayar("Hp", "i7", "Nvidia", 16, 17.3); //Hp oluþturma iþlemi Hp fabrikasýna býrakýldý. 
		
		AsusFabrika asusFabrika = new AsusFabrika();
		Bilgisayar Asus = asusFabrika.getBilgisayar("Asus", "i9", "Nvidia", 32, 15.6); //Asus oluþturma iþlemi Asus fabrikasýna býrakýldý.
		
		System.out.println(Hp);
		System.out.println(Asus);
	
		//Diðer fabrika iþleminden farklý olarak ileride daha fazla marka model oluþtuðunda çok fazla if else durumu olacaðýndan bunu ortadan kaldýrýyor.
	}
	
}
