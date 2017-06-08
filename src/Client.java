
public class Client {

	public static void main(String[] args) {
		  RemoteControl control = new RemoteControl();
		    Light light = new Light();
		    Command lightOn = new LightOn(light);
		    Command lightOff = new LightOff(light);
		 
		    control.setCommand(lightOn);
		    control.pressButton();
		 
		    control.setCommand(lightOff);
		    control.pressButton();
		
System.out.println("light on");
		 
	}

}
