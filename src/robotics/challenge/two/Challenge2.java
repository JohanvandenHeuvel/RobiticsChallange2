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
		System.out.println("Color loaded..");
		EV3GyroSensor gyro = new EV3GyroSensor(SensorPort.S3);
		System.out.println("Gyro loaded..");
		EV3UltrasonicSensor sonic = new EV3UltrasonicSensor(SensorPort.S2);
		System.out.println("Sonic loaded..");
		System.out.println("Sensors loaded..");
		
		//Behaviors
		Behavior FollowLine = new FollowLine(color, gyro);
		System.out.println("FollowLine loaded..");
		Behavior Bridge = new Bridge (color, gyro);
		System.out.println("Bridge loaded..");
		System.out.println("Behaviors loaded..");

		
		//Arbitrator
		Behavior [] bArray = {FollowLine, Bridge};
		Arbitrator arbitrator = new Arbitrator(bArray);
		arbitrator.start();
	}
}
