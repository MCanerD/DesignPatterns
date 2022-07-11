
public class Singleton {


	private static Singleton singleton = new Singleton (); //De�iken de static olmal� ��nk� metod y�klenirken olmayan de�i�ken kullan�lamaz.
	
	private static int sayac = 0;
	
	private Singleton() {
		
		System.out.println("Nesne olu�tu."); //�al��t���nda d�ng� i�erisinde tek sefer �al��acak, sonraburay� atlayacak. Singleton pattern en basit haliyle bu �ekilde �al���yor.
		
	}
	
	public static Singleton getSingleton() { //Nesnede new kullanmadan metoda eri�ebilmek i�in static olmal�.
		
		sayac++;
		System.out.println(sayac);
		return singleton;
	}
	
}
