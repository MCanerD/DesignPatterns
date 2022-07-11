import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		Urun domates = new Urun("Domates", BigDecimal.TEN);
		Urun patates = new Urun("Patetes", BigDecimal.ONE);
		Urun sogan = new Urun("Soðan", BigDecimal.ONE);
		
		Paket sebzePaketi = new Paket("Sebze Paketi");
		sebzePaketi.getUrunList().add(domates);
		sebzePaketi.getUrunList().add(patates);	
		sebzePaketi.getUrunList().add(sogan);
	
		Urun sesSistemi = new Urun("Ses sistemi", BigDecimal.valueOf(5000));
		Urun kulaklik = new Urun("Kulaklik", BigDecimal.valueOf(1000));
	
		Paket teknolojiPaketi = new Paket("Teknoloji Paketi");
		teknolojiPaketi.getUrunList().add(sesSistemi);
		teknolojiPaketi.getUrunList().add(kulaklik);	
		
		Urun futbolTopu = new Urun("Futbol Topu", BigDecimal.valueOf(100));
		Urun basketTopu = new Urun("Basketbol Topu", BigDecimal.valueOf(80));
		
		Paket sporPaketi = new Paket("Spor Paketi");
		sporPaketi.getUrunList().add(futbolTopu);
		sporPaketi.getUrunList().add(basketTopu);
		
		
		Kumanya kumanya = new Kumanya("Yolculuk Kumanyasi"); 
		
		Urun yag = new Urun("Yað", BigDecimal.valueOf(50));
		
		kumanya.getPaketList().add(sebzePaketi);
		kumanya.getUrunList().add(yag);
		
		Sepet sepet = new Sepet("Benim Sepetim");
		sepet.getFiyatlanabilirlist().add(sebzePaketi);
		sepet.getFiyatlanabilirlist().add(teknolojiPaketi);
		sepet.getFiyatlanabilirlist().add(sporPaketi);
		sepet.getFiyatlanabilirlist().add(kumanya);
		
		BigDecimal toplamTutar = sepet.toplamOdenecekTutar();
		
		
		System.out.println("Ödenecek tutar: "+ toplamTutar + "TL" );
		
	}
	
}
