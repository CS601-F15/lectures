import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Atomic {

	private List<Integer> numbers;
	private ReentrantReadWriteLock lock;
	
	public Atomic() {
		this.numbers = new ArrayList<Integer>();
		this.lock = new ReentrantReadWriteLock();
	}
	
	public void addTwo() {
		
		lock.writeLock().lock();
		numbers.add(1);
		lock.writeLock().unlock();
		
		lock.writeLock().lock();
		numbers.add(2);
		lock.writeLock().unlock();

	}
	
	public void printSize() {
		lock.readLock().lock();
		System.out.println("size: " + numbers.size());
		lock.readLock().unlock();
	}
	
	public static void main(String[] args) {
		Atomic a = new Atomic();
		
		Thread writer = new Thread(new Runnable() {
			public void run() {
				a.addTwo();
			}
		});
		Thread reader = new Thread(new Runnable() {
			public void run() {
				a.printSize();			}
		});
		
		writer.start();
		reader.start();
		
	}
	
	
}
