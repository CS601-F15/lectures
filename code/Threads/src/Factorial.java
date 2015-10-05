
public class Factorial implements Runnable {

	private int value;
	
	public Factorial(int value) {
		this.value = value;
	}
	
	
	@Override
	public void run() {
		
		int product = 1;
		for(int i = 1; i <= value; i++) {
			product = product * i;
		}
		
		
	}

}
