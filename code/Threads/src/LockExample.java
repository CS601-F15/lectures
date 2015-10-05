
public class LockExample {

	private boolean writer;	

	/**
	 * Construct a new ReentrantLock.
	 */
	public LockExample() {
		this.writer = false;
	}	

	/**
	 * Returns true if the invoking thread holds a read lock.
	 * @return
	 */
	public synchronized boolean hasRead() {
		return false;
	}

	public synchronized boolean hasWrite() {
		//		if(writer) {
		//			return true;
		//		} 
		//		return false;

		return writer;

	}

	/**
	 * Non-blocking method that attempts to acquire the read lock.
	 * Returns true if successful.
	 * @return
	 */
	public synchronized boolean tryLockRead() {
		return false;
	}


	public synchronized boolean tryLockWrite() {

		/*
		 * if I can grant write lock (is lock already held?)
		 * 	grant it
		 * 	return true
		 * return false
		 */

		//no one holds lock
		if(writer == false) { //if(!writer) 
			//grant lock
			writer = true;
			return true;

		}
		return false;

	}

	/**
	 * Blocking method that will return only when the read lock has been 
	 * acquired.
	 */
	public synchronized void lockRead() {
	}

	/**
	 * Releases the read lock held by the calling thread. Other threads may continue
	 * to hold a read lock.
	 */
	public synchronized void unlockRead() {
	}

	/**
	 * Blocking method that will return only when the write lock has been 
	 * acquired.
	 */
	public synchronized void lockWrite() {
		
//wait()????		
		
		while(  writer == true  ) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
				
		//take the write lock
		
	}

	/**
	 * Releases the write lock held by the calling thread. The calling thread may continue to hold
	 * a read lock.
	 */

	public synchronized void unlockWrite() {
		
		if(writer) {
			writer = false;
			notifyAll();
		} else {
			System.out.println("Illegal unlock without having lock");
		}		
	}


	public static void main(String[] args) {
		int num = 5; //will be 5-10
		
		if(num == 5) {
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			System.out.println("I love Java!");
		} else if (num == 6) {
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			System.out.println("I love Java!");
			
		}
		
		
		
	}



}


