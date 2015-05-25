package org.usfirst.frc.team766.robot.commands.auton;

import org.usfirst.frc.team766.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Choose which auton command to run This runs after the AutonSelector is
 * updated. Runs the appropriate auton mode
 * 
 * @author Patrick Kao
 * @author Brett Levenson blevenson68@gmail.com
 */

public class AutonSelectorCommand extends CommandGroup {

	public AutonSelectorCommand(int mode) {
		// pass in the auton mode

		switch (mode) {
		// runs the Move Command
		case RobotMap.AUTON_DO_NOTHING:
			System.out.println("Auton Do Nothing");
			break;
		case RobotMap.AUTON_1_TRASH:
			addSequential(new Auton1Trash());
			break;
		default: {
			System.out.println("Auton selection failed");
			break;
		}
		}
	}
}
