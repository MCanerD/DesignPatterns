
public class Buzdolabi implements ElektrikliEvAletleri {

	private int volt;
	
	public Buzdolabi() {
		this.volt = 220;
	}

	@Override
	public int prizeTak() {
		System.out.println("Buzdolab� �al���yor.");
		return volt;
	}
	

}