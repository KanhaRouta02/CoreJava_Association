package B_composition;

class Engine {
	private String engineType;

	public Engine(String engineType) {
		this.engineType = engineType;
	}

	public String get() {
		return engineType;
	}
}

class Car {
	private Engine engine;

	public Car(String engineType) {
		this.engine = new Engine(engineType);
	}
//	Car()
//	{
//		//  java.lang.NullPointerException
//	}

	public void startCar() {
		System.out.println("Car with " + engine.get() + " engine is staring");
	}
}

public class Test {

	public static void main(String[] args) {

		Car car = new Car("v8");
		car.startCar();
	}

}
