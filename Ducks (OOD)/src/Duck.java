public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehaviour quackBehaviour;

	public Duck() {
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks floats, even decoys!");
	}

	public void setFlyBehaviour(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}
