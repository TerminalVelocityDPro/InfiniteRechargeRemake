// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  Spark rotator = new Spark(Constants.rotatorNumber);
  Spark ballPutter = new Spark(Constants.ballPutterNumber);
  public Intake() {}

  public void suckIn(double speed){
    ballPutter.set(speed);
  }

  public void moveUp(double speed){
    rotator.set(speed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
