public abstract class Beverage {

	protected int ounces;
		
	public int getSize() {
		return this.ounces;
	}
	
	public abstract String getServingGlass();
}