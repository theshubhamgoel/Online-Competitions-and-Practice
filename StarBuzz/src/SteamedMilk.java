public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Stream milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}