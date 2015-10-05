
public class WaitVsBusywait {

	private volatile boolean shutdown;

	public WaitVsBusywait() {
		this.shutdown = false;
	}	

	public void busyWait() {
		while(!shutdown) {
			//do nothing
		}
		System.out.println("I've been shutdown!");
	}

	public void nonbusyWait() {
		synchronized(this) {
			while(!shutdown) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("I've been shutdown!");
	}

	public void shutdown() {
		this.shutdown = true;
		synchronized(this) {
			notify();
		}
	}

	public static void main(String[] args) {

		WaitVsBusywait example = new WaitVsBusywait();

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					example.shutdown();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}

		});
		t.start();		

		example.nonbusyWait();




	}


}
