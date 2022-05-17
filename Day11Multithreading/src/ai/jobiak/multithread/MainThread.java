package ai.jobiak.multithread;

public class MainThread extends Thread {

	public static void main(String[] args) {
		
		Threads thr=new Threads("thread");
		Threads thr1=new Threads("thread1");
		System.out.println("thread started");
		thr.start();
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thr1.start();
		System.out.println("thread ended");
		

	}

}
