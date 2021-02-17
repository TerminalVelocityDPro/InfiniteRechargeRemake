// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ComplexAuto1 extends SequentialCommandGroup {
  /** Creates a new ComplexAuto1. */
  public ComplexAuto1(DriveTrain drive, Shooter shooter) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    super(new AutoDrive(drive, -0.5, 0.5).withTimeout(1), 
    new AutoDrive(drive, -0.5, 0.5).withTimeout(1), 
    new AutoDrive(drive, 0.5, 0.5).withTimeout(3), 
    new AutoDrive(drive, 0.5, -0.5).withTimeout(1), 
    new Shoot(shooter, 0.5).withTimeout(0.5));
  }
}
