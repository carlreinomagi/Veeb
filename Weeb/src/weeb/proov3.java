package weeb;

public class proov3 {

	public static void main(String[] args) {
		pealkirjagakomponent lumeuudis = new pealkirjagakomponent(
				new veebipealkiri(2, new veebitekst("Esimene lumi")));
		lumeuudis.lisasisu(new veebitekst(
				"Hommikul sadas lund"));
		veebileht v=new veebileht("lumelehekene", lumeuudis);
		System.out.println(v.kysiHTML());
				

	}

}
