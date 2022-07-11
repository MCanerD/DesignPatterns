import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
	
		//YoneticiProxy yoneticiProxy = new YoneticiProxy("veli","1234");
	
		YoneticiProxy yoneticiProxy = new YoneticiProxy("metin","1111");
			try {
			BigDecimal ciro = yoneticiProxy.getCiro();
				System.out.println("Þirket cirosu : " + ciro);
			} 
			catch (IllegalAccessException e) {
				System.out.println("Hassas Bilgilere eriþim izniniz yoktur.");
			}
			

	}
}
