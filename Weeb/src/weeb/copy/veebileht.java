package weeb.copy;

public class veebileht {
	protected String pealkiri;
	protected veebisvaadatav sisu;
	public veebileht(String pealkiri, veebisvaadatav sisu){
		this.pealkiri=pealkiri;
		this.sisu=sisu;
	}
public String kysiHTML(){
	return "<!doctype html>\n"+
			"	<html>\n"+
			"		<head>\n"+
			"			<title>"+pealkiri+"</title>\n"+
			"		</head>\n"+
			"	<body>\n"+
				sisu.html()+"\n"+
			"	</body>}\n"+
			"	</html>";
}
}
