package weeb;
//eksamiks
public class veebipealkiri extends veebielement {
	int tase;
	veebitekst sisu;

	public veebipealkiri(int tase, veebitekst sisu) {
		if (tase < 1 || tase > 6) {
			throw new RuntimeException("Sobimatu tase : " + tase);
		}
		this.tase = tase;
		this.sisu = sisu;
	}

	public String html() {
		return "<h" + tase +atr()+ ">" + sisu.html() + "</h" + tase + ">";
	}
}
