
public class Singleton {


	private static Singleton singleton = new Singleton (); //Deðiken de static olmalý çünkü metod yüklenirken olmayan deðiþken kullanýlamaz.
	
	private static int sayac = 0;
	
	private Singleton() {
		
		System.out.println("Nesne oluþtu."); //Çalýþtýðýnda döngü içerisinde tek sefer çalýþacak, sonraburayý atlayacak. Singleton pattern en basit haliyle bu þekilde çalýþýyor.
		
	}
	
	public static Singleton getSingleton() { //Nesnede new kullanmadan metoda eriþebilmek için static olmalý.
		
		sayac++;
		System.out.println(sayac);
		return singleton;
	}
	
}
