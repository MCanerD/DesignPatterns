
public class BelgeTuru {
	
	private long id;
	private String adi;
	
	public BelgeTuru() {
		
		
		
	}

	public long getId() {
		return id;
	}

	public String getAdi() {
		return adi;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return adi;
	}
	
	
}
