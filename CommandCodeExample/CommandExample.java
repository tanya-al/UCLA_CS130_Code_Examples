// this is the client class
public class CommandExample {
	public static void main(String[] args) {
		// the remote is the INVOKER
		SimpleRemoteControl remote = new SimpleRemoteControl();
		// the light object is the RECEIVER
		Light light = new Light();

		// STEP 1: Client creates command Object (in this case LightOnCommand)
		LightOnCommand lightOn = new LightOnCommand(light);

		// STEP 2: client calls set command on INVOKER (aka remote) and passes it the COMMAND object
		remote.setCommand(lightOn);

		// STEP 3: client calls INVOKER to execute the command, the INVOKER calls the COMMAND object, 
		// which invokes actions on the RECEIVER (the Light)
		remote.buttonWasPressed();
	}
}