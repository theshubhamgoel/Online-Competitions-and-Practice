import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList observers;

	private float temperature;
	private float humidity;
	private float presure;

	public WeatherData() {
		observers = new ArrayList();
	}

	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float presure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.presure = presure;
		notifyObservers();
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, presure);
		}
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}
}
