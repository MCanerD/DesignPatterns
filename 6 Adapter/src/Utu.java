
public class Utu implements ElektrikliEvAletleri{

	
	private int volt;
	
	public Utu() {
		this.volt = 220;
	}
	
	@Override
	public int prizeTak() { 
		System.out.println("�t� �al���yor.");
		return volt;
	}
	
	

}
