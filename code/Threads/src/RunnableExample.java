import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class RunnableExample {

	public static final long MAX = 300000; 
	
	public static void main(String[] args) {
		
		ExecutorService threadPool = Executors.newFixedThreadPool(5);		
		
		//for each json file
		//  create a new job
		//  execute that job
		
		for(int i = 1; i < MAX; i++) {
			threadPool.execute(new Factorial(i));			
		
		}		
		threadPool.shutdown();
		try {
			threadPool.awaitTermination(2, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		
	
}

