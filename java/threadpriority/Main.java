package threadpriority;

public class Main {

	public static void main(String[] args) {
		
	AThread t1 = new AThread();
	BThread t2 = new BThread();
	
	t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);

    t1.start();
    t2.start();
	}
	
}
