
public class PcBayi {

	public static void main(String[] args) {
		
		HpFabrika hpFabrika = new HpFabrika();
		Bilgisayar Hp = hpFabrika.getBilgisayar("Hp", "i7", "Nvidia", 16, 17.3); //Hp olu�turma i�lemi Hp fabrikas�na b�rak�ld�. 
		
		AsusFabrika asusFabrika = new AsusFabrika();
		Bilgisayar Asus = asusFabrika.getBilgisayar("Asus", "i9", "Nvidia", 32, 15.6); //Asus olu�turma i�lemi Asus fabrikas�na b�rak�ld�.
		
		System.out.println(Hp);
		System.out.println(Asus);
	
		//Di�er fabrika i�leminden farkl� olarak ileride daha fazla marka model olu�tu�unda �ok fazla if else durumu olaca��ndan bunu ortadan kald�r�yor.
	}
	
}
