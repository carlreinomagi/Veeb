package weeb;

public class Proov2 {
	public static void main(String[] arg) {
		String s = "sajab";
		veebitekst pealkirjatekst = new veebitekst(s);
		veebipealkiri p = new veebipealkiri(1, pealkirjatekst);
		veebileht v = new veebileht("talv", p);
		System.out.println(v.kysiHTML());
	}
}
