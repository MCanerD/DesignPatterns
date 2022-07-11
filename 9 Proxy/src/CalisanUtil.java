import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CalisanUtil {

	public static List<Calisan> getCalisanList(){
		
		Calisan veli = new Calisan("veli", "1234", false);
		Calisan ali = new Calisan("ali", "asdf", false);
		Calisan metin = new Calisan("metin", "1111", true);
	
	
		List<Calisan> calisaList = new ArrayList<>();
		calisaList.add(veli);
		calisaList.add(ali);
		calisaList.add(metin);
		
		return calisaList;
	}
	
	public static Map<String, Calisan> getKullaniciAdiCalisanMap(){
		List<Calisan> calisanList = getCalisanList();
		
		Map<String, Calisan> map = new LinkedHashMap<>();
		
		for(Calisan calisan : calisanList) {
			
			map.put(calisan.getKullaniciAdi(), calisan);
		}
		return map;
	}
	
	public static Calisan getCalisanByKullaniciAdi(String kullaniciAdi) {
		
		Map<String, Calisan> map = getKullaniciAdiCalisanMap();
		
		Calisan calisan = map.get(kullaniciAdi);
		
		return calisan;
		
	}

	public static boolean isKullaniciValid(String kullaniciAdi, String sifre) {

		boolean isKullaniciValid = false;
		
		Calisan calisan = getCalisanByKullaniciAdi(kullaniciAdi);
		
		if(calisan != null) {
			
			isKullaniciValid = calisan.getSifre().equals(sifre);
			
		}
		return isKullaniciValid;
		
	}
	
}
