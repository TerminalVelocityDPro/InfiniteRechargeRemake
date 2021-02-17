// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  CANSparkMax frontLeft = new CANSparkMax(Constants.frontLeftMotor, MotorType.kBrushless);
  CANSparkMax backLeft = new CANSparkMax(Constants.backLeftMotor, MotorType.kBrushless);
  CANSparkMax frontRight = new CANSparkMax(Constants.frontRightMotor, MotorType.kBrushless);
  CANSparkMax backRight = new CANSparkMax(Constants.backRightMotor, MotorType.kBrushless);
  public DriveTrain() {

  }

  public void drive(double left, double right){
    double checkLeft = Math.abs(left);
    double checkRight = Math.abs(right);

    if(checkLeft > 0.25){
      frontLeft.set(left);
      backLeft.set(left);
    }else{
      frontLeft.set(0);
      backLeft.set(0);
    }

    if(checkRight > 0.25){
      frontRight.set(-right);
      backRight.set(-right);
    }else{
      frontRight.set(0);
      backRight.set(0);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
