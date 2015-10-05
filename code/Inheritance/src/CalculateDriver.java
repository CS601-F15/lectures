import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Scanner;

public class CalculateDriver {

	public static void main(String[] args) {

		HashMap<String, Class> mapping = new HashMap<String, Class>();
		
		mapping.put("add", Adder.class);
		mapping.put("multiply", Multiplier.class);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter operation [add/multiply]");
		//TODO: error check here
		String operation = input.next();
				
		if(mapping.containsKey(operation)) {
			Calculator calc = null;
			try {
			
				calc = (Calculator) mapping.get(operation).getConstructor().newInstance();

			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}			
			double result = calc.calculate(num1, num2);		
			System.out.println("Result: " + result);
		}
		
	}

}
