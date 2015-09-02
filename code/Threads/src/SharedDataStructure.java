import java.util.ArrayList;
import java.util.List;


public class SharedDataStructure {

	private List<Integer> numbers;
	//private ReentrantReadWriteLock lock;
	
	public SharedDataStructure() {
		this.numbers = new ArrayList<Integer>();
		//this.lock = new ReentrantReadWriteLock();
	}
	
	/* TBD: use of the synchronized keyword */
	public void addNumber(int number) {
		//lock write
		//lock.writeLock().lock();
		this.numbers.add(number);
		//unlock write
		//lock.writeLock().unlock();
	}	

	public  int size() {
		//lock read
		return this.numbers.size();
		//unlock read
	}
}
