import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {

	private String ad;
	private List<Fiyatlanabilir> fiyatlanabilirlist;
	
	
	public Sepet(String ad) {

		this.ad = ad;
		this.fiyatlanabilirlist = new ArrayList<>();
	}


	public BigDecimal toplamOdenecekTutar() {
		
		BigDecimal toplamTutar = BigDecimal.ZERO;
		
		for(Fiyatlanabilir fiyatlanabilir : fiyatlanabilirlist) {
			
			toplamTutar = toplamTutar.add(fiyatlanabilir.getFiyat());
			
		}
		
		return toplamTutar;
		
	}
		
	public String getAd() {
		return ad;
	}


	public List<Fiyatlanabilir> getFiyatlanabilirlist() {
		return fiyatlanabilirlist;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public void setFiyatlanabilirlist(List<Fiyatlanabilir> fiyatlanabilirlist) {
		this.fiyatlanabilirlist = fiyatlanabilirlist;
	}
	
	



}
