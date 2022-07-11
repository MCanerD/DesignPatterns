
public class TelefonEeAdaptor implements ElektrikliEvAletleri {

	
	private  Telefon telefon;
	
	public TelefonEeAdaptor(Telefon telefon) {
		
		this.telefon = telefon;
		
	}
	
	
	@Override
	public int prizeTak() {
		return telefon.sarjEt();
	}

	
	
}
