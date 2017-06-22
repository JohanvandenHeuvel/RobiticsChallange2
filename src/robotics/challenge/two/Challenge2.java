package robotics.challenge.two;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Challenge2 {

	/**
	 * Race task
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting..");
		
		//Sensors
		EV3ColorSensor color = new EV3ColorSensor(SensorPort.S1);
		EV3GyroSensor gyro = new EV3GyroSensor(SensorPort.S3);
		EV3UltrasonicSensor sonic = new EV3UltrasonicSensor(SensorPort.S4);
		
		//Behaviors
		Behavior FindLine = new FindLine();
		Behavior FollowLine = new FollowLine(color);
		
		//Arbitrator
		Behavior [] bArray = {FindLine, FollowLine};
		Arbitrator arbitrator = new Arbitrator(bArray);
		arbitrator.start();
	}
}
