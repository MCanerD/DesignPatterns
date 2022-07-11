
public class EmlakciV2 {
	
	public static void main(String[] args) {
		
				
		Ev ev1 = EvBuilder.startNormalEvBuild("Ýstanbul", "Maltepe", "Feyzullah", 2011, 3) //zorunlu istenen bilgiler.

			.setHasCocukpark(true)
			.setHasCocukpark(true)
			//tercihe baðlý bilgiler.
			.build();
			//Girilmeyen bilgielr otomatik olarak olmadýðý varsayýlarak iþleniyor.
		printEv(ev1);
			
	
		Ev ev2 = EvBuilder.startHavuzluEvBuild("Ýstanbul", "Maltepe", "Altaycesme", 2017, 4) //Havuz otomatik olarak var seçilecek.

			.setHasCocukpark(false)
			.setHasCocukpark(true)

			.build();

		printEv(ev2);
	}		
	
	private static void printEv(Ev ev) {
	
	
	System.out.println("Ev eklendi : " + ev );
	}
	
	//Belirtilmesi istenen bilgilerin zorunlu veya tercihe baðlý olmasý bu þekilde builder ile bu þekilde saðlanabiliyor, 
}
