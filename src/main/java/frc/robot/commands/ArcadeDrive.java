package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystems.DistanceSensorSubsystem;

public class ArcadeDrive extends CommandBase {
  private final DriveTrainSubsystem drivetrainSubsystem;
  private final XboxController joystick;
  private final DistanceSensorSubsystem distanceSensorSubsystem;

  public ArcadeDrive(DriveTrainSubsystem drivetrainSubsystem, XboxController joystick, DistanceSensorSubsystem distanceSensorSubsystem) {
    this.drivetrainSubsystem = drivetrainSubsystem;
    this.joystick = joystick;
    this.distanceSensorSubsystem = distanceSensorSubsystem;
    // Declare subsystem dependencies here
    addRequirements(this.drivetrainSubsystem);
  }

  @Override
  public void initialize() {
    // Initialization logic if needed
  }

  @Override
  public void execute() {
    double target = 0;
    if (distanceSensorSubsystem.getDistance() <= target){
      drivetrainSubsystem.brake();

    }
    else{
      double speed = joystick.getLeftY();
      if (speed > 0) {
        drivetrainSubsystem.setPower(speed * 0.5);
      } else if (speed < 0) {
        drivetrainSubsystem.setPower(speed * 0.5 - 0.5);
      } else {
        drivetrainSubsystem.brake();
      }
      double turn = joystick.getLeftX();
      if (turn > 0){
        drivetrainSubsystem.TurnLeft(turn);
      }
      if (turn < 0){
        drivetrainSubsystem.TurnRight(turn);
      }
    }

  }

  @Override
  public void end(boolean interrupted) {
    drivetrainSubsystem.brake();
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
