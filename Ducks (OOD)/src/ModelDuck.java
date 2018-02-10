public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("I am a model Duck");
	}
}
