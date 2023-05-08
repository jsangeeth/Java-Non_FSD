package taskday5;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[4] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
