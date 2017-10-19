package org.usfirst.frc.team1360.robot;

public class HumanInput {
	public static XboxRemote driver = new XboxRemote(0);
	public static XboxRemote operator = new XboxRemote(1);
	
	public static double getLeftThrottle() {
		return driver.getLeftYAxis();
	}
	
	public static double getRightThrottle() {
		return driver.getRightYAxis();
	}
}
