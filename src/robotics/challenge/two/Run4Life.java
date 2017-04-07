package robotics.challenge.two;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Run4Life {

	public static void main(String[] args) {
		Behavior findLine = new Behavior() {
			
			@Override
			public boolean takeControl() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void suppress() {
				//suppressed = true;
				//should higher behaviors call suppress?
				
			}
			
			@Override
			public void action() {
				//Drive around randomly
				
			}
		};
		
		Behavior followLine = new Behavior() {
			
			@Override
			public boolean takeControl() {
				//takeControl if on white line
				return false;
			}
			
			@Override
			public void suppress() {
				//suppressed = true;
				
			}
			
			@Override
			public void action() {
				//follow the white line
				
			}
		};
		
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
		
	
		
		Behavior [] bArray = {findLine,followLine,crossSeesaw,crossBridge};
		
		Arbitrator arby = new Arbitrator(bArray);
		
		arby.start();

	}

}
