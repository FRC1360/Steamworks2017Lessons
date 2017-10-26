package org.usfirst.frc.team1360.robot;

public class DriveSubsystem {
	public static void tankDrive(double left, double right) {
		RobotOutput.mtrLeftDrive.set(left);
		RobotOutput.mtrRightDrive.set(right);
	}
	
	public static void arcadeDrive(double throttle, double turn) {
		RobotOutput.mtrLeftDrive.set(throttle + turn);
		RobotOutput.mtrRightDrive.set(throttle - turn);
	}
	
	public static void handleDriveTeleop() {
		tankDrive(HumanInput.getLeftThrottle(), HumanInput.getRightThrottle());
	}
}
