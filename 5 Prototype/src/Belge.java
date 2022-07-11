
public class Belge implements Cloneable{//Nesneyi klonlayabilmeyi saðlýyor.

	private long id;
	private String adi;
	private BelgeTuru belgeTuru;
	private Kategori kategori;
	private String veri;

	public Belge(){
		
	}

	public Belge(long id, String adi, BelgeTuru belgeTuru, Kategori kategori, String veri) {
		this.id = id;
		this.adi = adi;
		this.belgeTuru = belgeTuru;
		this.kategori = kategori;
		this.veri = veri;
	}

	public long getId() {
		return id;
	}

	public String getAdi() {
		return adi;
	}

	public BelgeTuru getBelgeTuru() {
		return belgeTuru;
	}

	public Kategori getKategori() {
		return kategori;
	}

	public String getVeri() {
		return veri;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public void setBelgeTuru(BelgeTuru belgeTuru) {
		this.belgeTuru = belgeTuru;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

	public void setVeri(String veri) {
		this.veri = veri;
	}

	
	
	
	@Override
	protected Belge clone() throws CloneNotSupportedException {
		return (Belge) super.clone();
	}

	@Override
	public String toString() {
		return "Belge [\nid=" + id + ",\n adi=" + adi + ",\n belgeTuru=" + belgeTuru + ",\n kategori=" + kategori + ",\n veri="
				+ veri + "]";
	}
	
	
	
	

}
