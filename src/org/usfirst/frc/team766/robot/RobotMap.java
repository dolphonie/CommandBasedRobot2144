package org.usfirst.frc.team766.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// autons
	public static final int AUTON_DO_NOTHING = 0;
	public static final int AUTON_1_TRASH = 1;
	public static final String[] Autons = { "Do nothing", "1 Trash" };

	public static int autonMode;
}
