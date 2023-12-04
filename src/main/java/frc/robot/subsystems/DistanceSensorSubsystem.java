// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Ultrasonic;

public class DistanceSensorSubsystem {

    private Ultrasonic m_rangeFinder;
    public DistanceSensorSubsystem() {
        m_rangeFinder = new Ultrasonic(1, 2);
    }
    public double getDistance(){
      double distance = m_rangeFinder.getRangeInches();
      return distance;
    }
  }