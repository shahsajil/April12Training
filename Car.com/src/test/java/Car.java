import java.lang.reflect.Constructor;

public class Car {
	private int odometer;
	private String name;

	public Car() {

	}

	public int getOdometer() {
		return odometer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Constructor<Car> construtor = Car.class.getDeclaredConstructor();
			Car largeEngine = construtor.newInstance();
			largeEngine.setName("engine");
			System.out.println(largeEngine.name);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
