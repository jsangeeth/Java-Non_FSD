package threadpriority;

public class BThread extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 executing...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}
