public class Coffee extends Beverage {
	
	protected boolean isDecaf;
	
	public Coffee(boolean isDecaf) {
		this.isDecaf = isDecaf;
	}
	
	public String getServingGlass() {
		return "Cup";
	}
	
	public boolean isDecaf() {
		return this.isDecaf;
	}	
}