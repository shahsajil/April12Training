import org.testng.annotations.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		String model = "Corvette";
		Car car1 = new Car(model);
		car1.startEngine();
	}
}
