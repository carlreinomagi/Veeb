package weeb.copy;

public class veebitekst implements veebisvaadatav {
	protected String sisu;
	public veebitekst(String sisu){
		this.sisu=sisu;
	}
	
	public String html(){
		return sisu.replace("<","&lt;").replace(">","&gt;");
	}
}
