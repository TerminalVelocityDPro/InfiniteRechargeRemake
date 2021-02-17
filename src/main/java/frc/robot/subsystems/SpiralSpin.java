// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SpiralSpin extends SubsystemBase {
  /** Creates a new SpiralSpin. */
  DoubleSolenoid doubleS = new DoubleSolenoid(Constants.doubleSolenoidPort1, Constants.doubleSolenoidPort2);
  public SpiralSpin() {}

  public void pushPull(int num){
    if(num == 0){
      doubleS.set(Value.kOff);
    }else if(num == 1){
      doubleS.set(Value.kForward);
    }else if(num == -1){
      doubleS.set(Value.kReverse);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
