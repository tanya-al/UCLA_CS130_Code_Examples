public class ConcreteStateB implements State {
	Context context;
	public ConcreteStateB(Context context) {
		this.context = context;
	}
	public void transitionState() {
		System.out.println("transitioning to state A");
		context.setState(context.getConcreteStateA());
	}
}