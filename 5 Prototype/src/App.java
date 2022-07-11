import java.util.Date;

public class App {

	public static void main(String[] args){
		
		GenelEntityServis genelEntityServis = new GenelEntityServis();
		
		long id1 = 1L;
		
		Date ilkTarih = new Date();		
		Belge belge1 = genelEntityServis.findBelgeById(id1);
		belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belge1);
		
		
		Date ilkTarih2 = new Date();
		Belge belge2 = genelEntityServis.findBelgeById(2L);
		belgeyiVeSaniyeFarkiniYazdir(ilkTarih2, belge2);
		
		Date ilkTarih3 = new Date(); 
	
		Belge belgeClone = null;
		try {
			belgeClone = belge1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		belgeClone.setAdi("Günlük");
		belgeClone.setVeri("Sevgili günlük...");
		
		belgeyiVeSaniyeFarkiniYazdir(ilkTarih3, belgeClone);
		
		
	}
		private static void belgeyiVeSaniyeFarkiniYazdir(Date ilkTarih, Belge belge1) {
			
			Date sonTarih = new Date();
			
			Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);
			
			System.out.println(belge1);
			System.out.println(saniyeFarki);
			
			System.out.println("\n");
			
			
		}
		private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih) { //Saniye farkýný belirtecek metod.
			
			
			long has = 1000;
			
			long saniyeFarki = (sonTarih.getTime() / has) - (ilkTarih.getTime() / has);
			
			return saniyeFarki;
			
			
			
		}
		
}
