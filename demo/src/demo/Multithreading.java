package demo;


public class Multithreading implements Runnable {
	public void run() {
		System.out.println("I am in threadclass1");
	}
	

  /* public class Multithreading extends Thread {
	public void run() {
		System.out.println("I am in threadclass1");
	} */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading Th = new Multithreading();
		Thread Th1 = new Thread(Th);
		Th1.start();
	}

}
