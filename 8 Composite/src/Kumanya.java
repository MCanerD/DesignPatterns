import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class Kumanya implements Fiyatlanabilir {

	private String ad;
	private List<Urun> urunList;
	private List<Paket> paketList;
	
	
	public Kumanya (String ad) {
		
		this.ad = ad;
		this.urunList = new ArrayList<>();
		this.paketList = new ArrayList<>();		
	}
	
	
	@Override
	public BigDecimal getFiyat() {
		
		BigDecimal toplamUrunFiyat =  FiyatHesaplama.getToplamUrunFiyat(urunList);
		BigDecimal toplamPaketFiyat =  FiyatHesaplama.getToplamPaketFiyat(paketList);
		
		BigDecimal toplamFiyat = toplamUrunFiyat.add(toplamPaketFiyat);
		
		return toplamUrunFiyat.add(toplamPaketFiyat);
	}


	public String getAd() {
		return ad;
	}


	public List<Urun> getUrunList() {
		return urunList;
	}


	public List<Paket> getPaketList() {
		return paketList;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public void setUrunList(List<Urun> urunList) {
		this.urunList = urunList;
	}


	public void setPaketList(List<Paket> paketList) {
		this.paketList = paketList;
	}

	
	
}
