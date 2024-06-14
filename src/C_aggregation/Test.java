package C_aggregation;

class Car {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void drive() {
		System.out.println("Driving the " + model);
	}
}

class Driver {
	private String name;
	private Car car;

	public Driver(String name) {
		this.name = name;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void deiveCar() {
		if (car != null) {
			System.out.println(name + " is Driving the " + car.getModel());
			car.drive();
		} else {
			System.out.println(name + " dont have any car to drive");
		}
	}
}

public class Test {

	public static void main(String[] args) {
		Car car = new Car("BMW");

		Driver driver = new Driver("Ram");
		driver.setCar(car);
		driver.deiveCar();
	}
}
