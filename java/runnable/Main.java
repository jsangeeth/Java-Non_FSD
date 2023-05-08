package runnable;

public class Main {

	public static void main(String[] args) {

		Runnable rc = () -> {

			System.out.println("Runnable Class is executing...");

		};
		Thread t1 = new Thread(rc);

		Thread t2 = new Thread(()-> {
			
				System.out.println("Thread class is executing...");
			
		});

		t1.start();
		t2.start();
	}
}
