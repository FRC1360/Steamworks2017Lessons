package org.usfirst.frc.team1360.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class HumanInput {
	public static XboxController driver = new XboxController(0);
	public static XboxController operator = new XboxController(1);
	
	public static double deadzone(double input)	{
		if (Math.abs(input) <= 0.1) {
			input = 0;
		}
		return input;
	}
	
	public static double getLeftThrottle() {
		return deadzone(driver.getY(Hand.kLeft));
	}
	
	public static double getRightThrottle() {
		return deadzone(driver.getY(Hand.kRight));
	}
}
