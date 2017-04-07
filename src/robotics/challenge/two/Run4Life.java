package robotics.challenge.two;

import lejos.hardware.port.SensorPort;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Run4Life {

	public static void main(String[] args) {
		Behavior findLine = new findLine();
		Behavior followLine = new followLine(SensorPort.S1);
		
		Behavior crossSeesaw = new Behavior() {
			
			@Override
			public boolean takeControl() {
				//takeControl if seesaw
				return false;
			}
			
			@Override
			public void suppress() {
				//suppressed = true;
				
			}
			
			@Override
			public void action() {
				//cross seesaw
				
			}
		};
		
		Behavior crossBridge = new Behavior() {
			
			@Override
			public boolean takeControl() {
				//takeControl if bridge
				return false;
			}
			
			@Override
			public void suppress() {
				//suppressed = true;
				
			}
			
			@Override
			public void action() {
				//cross bridge
				
			}
		};
		
	
		Behavior [] bArray = {findLine,followLine};
		//Behavior [] bArray = {findLine,followLine,crossSeesaw,crossBridge};
		
		Arbitrator arby = new Arbitrator(bArray);
		
		arby.start();

	}

}
