
public class Emlakci {

	public static void main(String[] args) {
		
		
		Ev ev1 = new Ev();
		
		ev1.setIl("�stanbul");
		ev1.setIlce("Maltepe");
		ev1.setMahalle("Feyzullah");
		ev1.setOdaSayisi(2);
		ev1.setBinaYili(2006);
		ev1.setHasKlima(true);
		

		Ev ev2 = new Ev("�stanbul","Maltepe","Altaycesme",2014, 1, 2, 1, 2, false, false, true, false, false, false); //Builder kullanark ihtia� duyulmayan parametreler
																													  //yaz�lmak zorunda kal�nm�yor,
																													  //bu sayede ileride parametre eklenmesine olanak sa�l�yor.
		printEv(ev1);
		
		printEv(ev2);

		
		}


	private static void printEv( Ev ev) {
		
		
		System.out.println("Ev eklendi : " + ev );

	} 


		
		
	
}
