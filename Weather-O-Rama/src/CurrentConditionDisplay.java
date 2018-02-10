public class CurrentConditionDisplay implements Observer, DisplayElement {

	private Subject weatherData;

	private float temperature;
	private float humidity;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float presure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current conditions : " + temperature
				+ "F degree and " + humidity + "% humidity");

	}

}
