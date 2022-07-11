
public class EmlakciV2 {
	
	public static void main(String[] args) {
		
				
		Ev ev1 = EvBuilder.startNormalEvBuild("�stanbul", "Maltepe", "Feyzullah", 2011, 3) //zorunlu istenen bilgiler.

			.setHasCocukpark(true)
			.setHasCocukpark(true)
			//tercihe ba�l� bilgiler.
			.build();
			//Girilmeyen bilgielr otomatik olarak olmad��� varsay�larak i�leniyor.
		printEv(ev1);
			
	
		Ev ev2 = EvBuilder.startHavuzluEvBuild("�stanbul", "Maltepe", "Altaycesme", 2017, 4) //Havuz otomatik olarak var se�ilecek.

			.setHasCocukpark(false)
			.setHasCocukpark(true)

			.build();

		printEv(ev2);
	}		
	
	private static void printEv(Ev ev) {
	
	
	System.out.println("Ev eklendi : " + ev );
	}
	
	//Belirtilmesi istenen bilgilerin zorunlu veya tercihe ba�l� olmas� bu �ekilde builder ile bu �ekilde sa�lanabiliyor, 
}
