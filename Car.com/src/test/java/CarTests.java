import org.testng.annotations.Test;

public class CarTests {
	public String Model = "Corvette";

	@Test
	public void canBuildCar() {
		CarTests car1 = new CarTests();
		System.out.println(car1.Model);

	}

}
