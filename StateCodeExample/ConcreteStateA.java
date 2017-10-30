public class ConcreteStateA implements State {
	Context context;
	public ConcreteStateA(Context context) {
		this.context = context;
	}
	public void transitionState() {
		System.out.println("transitioning to state B");
		context.setState(context.getConcreteStateB());
	}
}