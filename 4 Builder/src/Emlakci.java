
public class Emlakci {

	public static void main(String[] args) {
		
		
		Ev ev1 = new Ev();
		
		ev1.setIl("Ýstanbul");
		ev1.setIlce("Maltepe");
		ev1.setMahalle("Feyzullah");
		ev1.setOdaSayisi(2);
		ev1.setBinaYili(2006);
		ev1.setHasKlima(true);
		

		Ev ev2 = new Ev("Ýstanbul","Maltepe","Altaycesme",2014, 1, 2, 1, 2, false, false, true, false, false, false); //Builder kullanark ihtiaç duyulmayan parametreler
																													  //yazýlmak zorunda kalýnmýyor,
																													  //bu sayede ileride parametre eklenmesine olanak saðlýyor.
		printEv(ev1);
		
		printEv(ev2);

		
		}


	private static void printEv( Ev ev) {
		
		
		System.out.println("Ev eklendi : " + ev );

	} 


		
		
	
}
