
public class SamsungTelefon implements Telefon{

	private int calismaVoltaji;
	
	public SamsungTelefon() {
		calismaVoltaji = 5;
		 
	}
	@Override
	public int sarjEt() {
		System.out.println("Samsun telefon �arj oluyor.");
		return calismaVoltaji;
	}
	
	
}
