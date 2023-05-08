package casting;

public class Main {

	public static void main(String[] args) {

		Upcasting up = new DownCasting();
		up.upCasting();
		
		DownCasting down = (DownCasting) up;
		down.downCasting();
		down.upCasting2();
	}

}
