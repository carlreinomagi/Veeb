package weeb;

public class veebipealkiri implements veebisvaadatav {
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
		return "<h" + tase + ">" + sisu.html() + "</h" + tase + ">";
	}
}
