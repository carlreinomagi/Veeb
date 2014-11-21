package weeb;
//eksamiks
import java.util.List;
import java.util.ArrayList;

public class pealkirjagakomponent extends veebielement {
	protected veebipealkiri pealkiri;
	List<veebisvaadatav> sisud = new ArrayList<veebisvaadatav>();

	public pealkirjagakomponent(veebipealkiri pealkiri) {
		this.pealkiri = pealkiri;
	}

	public void lisasisu(veebisvaadatav sisu) {
		sisud.add(sisu);
	}

	public String html() {
		String t = "<div>"+atr()+">";
		t += pealkiri.html();
		for (veebisvaadatav sisu : sisud) {
			t += sisu.html();
		}
		t += "</div>";
		return t;
	}
}
