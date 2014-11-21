package weeb;
//eksamiks
public class proov4 {

	public static void main(String[] args) {
		pealkirjagakomponent lumeuudis = new pealkirjagakomponent(
				new veebipealkiri(2, new veebitekst("Esimene lumi")));
		
		pealkirjagakomponent liiklus = new pealkirjagakomponent(
				new veebipealkiri(2, new veebitekst("Liiklus ja libedus")));
		
		pealkirjagakomponent rehvid = new pealkirjagakomponent(
				new veebipealkiri(3, new veebitekst("Rehvid")));
		
		rehvid.lisasisu(new veebitekst(
				"Talvel on suverehvidega ohtlik sõita"));
		liiklus.lisasisu(rehvid);	
		lumeuudis.lisasisu(new veebitekst(
				"Hommikul sadas lund"));
		
		pealkirjagakomponent lumeteated = new pealkirjagakomponent(
				new veebipealkiri(3, new veebitekst("Lumi")));
		
		lumeteated.lisasisu(lumeuudis);
		lumeteated.lisasisu(liiklus);
		
		veebileht v=new veebileht("lumel", lumeuudis);
		System.out.println(v.kysiHTML());

	}

}
