
public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i<4; i++) {
		Singleton singleton = Singleton.getSingleton();  // singleton adındaki nesne new kullanımı olmadan bu şekilde oluşturulabiliyor.
		}
	}
}
