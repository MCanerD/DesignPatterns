
public class Ev {

	private String il;
	private String ilce;
	private String mahalle;
	private int binaYili;
	private int balkonSayisi;
	private int odaSayisi;
	private int banyoSayisi;
    private int tuvaletSayisi;
    
    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukpark;
    private boolean hasKlima;
    private boolean hasHavuz;
    

	public Ev(String il, String ilce, String mahalle, int binaYili, int balkonSayisi, int odaSayisi, int banyoSayisi,
			int tuvaletSayisi, boolean isDublex, boolean isEsyali, boolean hasOtopark, boolean hasCocukpark,
			boolean hasKlima, boolean hasHavuz) {
		super();
		this.il = il;
		this.ilce = ilce;
		this.mahalle = mahalle;
		this.binaYili = binaYili;
		this.balkonSayisi = balkonSayisi;
		this.odaSayisi = odaSayisi;
		this.banyoSayisi = banyoSayisi;
		this.tuvaletSayisi = tuvaletSayisi;
		this.isDublex = isDublex;
		this.isEsyali = isEsyali;
		this.hasOtopark = hasOtopark;
		this.hasCocukpark = hasCocukpark;
		this.hasKlima = hasKlima;
		this.hasHavuz = hasHavuz;
	}
	
	

	public Ev() {

	}



	@Override
	public String toString() {
		return "Ev [il=" + il + ", ilce=" + ilce + ", mahalle=" + mahalle + ", binaYili=" + binaYili + ", balkonSayisi="
				+ balkonSayisi + ", odaSayisi=" + odaSayisi + ", banyoSayisi=" + banyoSayisi + ", tuvaletSayisi="
				+ tuvaletSayisi + ", isDublex=" + isDublex + ", isEsyali=" + isEsyali + ", hasOtopark=" + hasOtopark
				+ ", hasCocukpark=" + hasCocukpark + ", hasKlima=" + hasKlima + ", hasHavuz=" + hasHavuz + "]";
	}

	public String getIl() {
		return il;
	}

	public String getIlce() {
		return ilce;
	}

	public String getMahalle() {
		return mahalle;
	}

	public int getBinaYili() {
		return binaYili;
	}

	public int getBalkonSayisi() {
		return balkonSayisi;
	}

	public int getOdaSayisi() {
		return odaSayisi;
	}

	public int getBanyoSayisi() {
		return banyoSayisi;
	}

	public int getTuvaletSayisi() {
		return tuvaletSayisi;
	}

	public boolean isDublex() {
		return isDublex;
	}

	public boolean isEsyali() {
		return isEsyali;
	}

	public boolean isHasOtopark() {
		return hasOtopark;
	}

	public boolean isHasCocukpark() {
		return hasCocukpark;
	}

	public boolean isHasKlima() {
		return hasKlima;
	}

	public boolean isHasHavuz() {
		return hasHavuz;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public void setBinaYili(int binaYili) {
		this.binaYili = binaYili;
	}

	public void setBalkonSayisi(int balkonSayisi) {
		this.balkonSayisi = balkonSayisi;
	}

	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}

	public void setBanyoSayisi(int banyoSayisi) {
		this.banyoSayisi = banyoSayisi;
	}

	public void setTuvaletSayisi(int tuvaletSayisi) {
		this.tuvaletSayisi = tuvaletSayisi;
	}

	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}

	public void setEsyali(boolean isEsyali) {
		this.isEsyali = isEsyali;
	}

	public void setHasOtopark(boolean hasOtopark) {
		this.hasOtopark = hasOtopark;
	}

	public void setHasCocukpark(boolean hasCocukpark) {
		this.hasCocukpark = hasCocukpark;
	}

	public void setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
	}

	public void setHasHavuz(boolean hasHavuz) {
		this.hasHavuz = hasHavuz;
	}
    
    
}
