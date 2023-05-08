package taskday4;

public class TrafficLight {

	enum TrafficLights {
		RED("Stop for a while!!"), YELLOW("slow down and wait "), GREEN("Good to go..."),;

		private String value;

		private TrafficLights(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

	public static void main(String[] args) {

		for (TrafficLights tl : TrafficLights.values()) {
			System.out.println(tl + "\n" + tl.getValue());
		}
	}
}
