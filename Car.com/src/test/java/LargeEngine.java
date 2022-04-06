
public class LargeEngine implements IEngine {
	
	public void message() {
		System.out.println("Engine Started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEngine vehicles = new LargeEngine();
		vehicles.message();

	}

}
