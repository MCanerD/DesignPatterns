import java.util.List;
import java.math.BigDecimal;

public class FiyatHesaplama {

	public static BigDecimal getToplamUrunFiyat(List<Urun> urunList) {
		
		BigDecimal toplamTutar = BigDecimal.ZERO;
		
		for(Urun urun : urunList) {
			
			toplamTutar = toplamTutar.add(urun.getFiyat());
			
		}
		
		return toplamTutar;
	}
	
	public static BigDecimal getToplamPaketFiyat(List<Paket> paketList) {
		
		BigDecimal toplamTutar = BigDecimal.ZERO;
		
		for(Paket paket : paketList) {
			
			toplamTutar = toplamTutar.add(paket.getFiyat());
			
		}
		
		return toplamTutar;
	}
	
}
