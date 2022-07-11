
public enum EnumMermiBoyutu {

	
	UC(3),
	BES(5),
	YEDÝ(7);

	private int boyut;

	EnumMermiBoyutu(int boyut) {
		this.boyut = boyut;
	}

	public String toString() {
		return String.valueOf(boyut);
	}
	
	public int getBoyut() {
		return boyut;
	}

}