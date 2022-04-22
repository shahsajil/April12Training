
public class Car {
	private int odometer;
	private LargeEngine engine;

	public Car(String model) {
		this.engine = new LargeEngine();
	}
	public void startEngine() {
		System.out.println("Engine Started");
	}
	public int getOdometer() {
		return odometer;
	}
}
