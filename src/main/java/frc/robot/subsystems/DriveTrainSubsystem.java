// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

//import frc.robot.Constants;

/** Add your docs here. */
public class DriveTrainSubsystem extends SubsystemBase {
    // create your private TalonFXs
    private TalonFX armTalonFX1;
    private TalonFX armTalonFX2;
    private TalonFX armTalonFX3;
    private TalonFX armTalonFX4;
    
    public DriveTrainSubsystem() {
      // initialize da motors with CANIds from Constants.java
      armTalonFX1 = new TalonFX(Constants.CANIds.leftFalcon1.id);
      armTalonFX2 = new TalonFX(Constants.CANIds.leftFalcon2.id);
      armTalonFX3 = new TalonFX(Constants.CANIds.rightFalcon1.id);
      armTalonFX4 = new TalonFX(Constants.CANIds.rightFalcon2.id);
    }
    
    // write your setPower methods
    public void setPower(double power) {
        armTalonFX1.set(ControlMode.PercentOutput, power);
        armTalonFX2.set(ControlMode.PercentOutput, power);
        armTalonFX3.set(ControlMode.PercentOutput, power);
        armTalonFX4.set(ControlMode.PercentOutput, power);
    }

    public void coast(){
        armTalonFX1.setNeutralMode(NeutralMode.Coast);
        armTalonFX2.setNeutralMode(NeutralMode.Coast);
        armTalonFX3.setNeutralMode(NeutralMode.Coast);
        armTalonFX4.setNeutralMode(NeutralMode.Coast);
    }

    public void brake(){
        armTalonFX1.setNeutralMode(NeutralMode.Brake);
        armTalonFX2.setNeutralMode(NeutralMode.Brake);
        armTalonFX3.setNeutralMode(NeutralMode.Brake);
        armTalonFX4.setNeutralMode(NeutralMode.Brake);

      }
    public void TurnLeft(double power){
        armTalonFX3.setNeutralMode(NeutralMode.Coast);
        armTalonFX4.setNeutralMode(NeutralMode.Coast);
        armTalonFX2.set(ControlMode.PercentOutput, power);
        armTalonFX1.set(ControlMode.PercentOutput, power);

      }      

    public void TurnRight(double power){
        armTalonFX1.setNeutralMode(NeutralMode.Coast);
        armTalonFX2.setNeutralMode(NeutralMode.Coast);
        armTalonFX3.set(ControlMode.PercentOutput, power);
        armTalonFX4.set(ControlMode.PercentOutput, power);

      }
    }      
    