// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private WPI_TalonSRX frontLeft = new WPI_TalonSRX(1);
  private WPI_TalonSRX frontRight = new WPI_TalonSRX(2);
  private WPI_TalonSRX rearLeft = new WPI_TalonSRX(3);
  private WPI_TalonSRX rearRight = new WPI_TalonSRX(4);

  //grupos de controladores right y left
  MotorControllerGroup right = new MotorControllerGroup(frontRight, rearRight);
  MotorControllerGroup left = new MotorControllerGroup(frontLeft, rearLeft);

  //differential drive 
  DifferentialDrive drive = new DifferentialDrive(right, left);

  //control xbox
  //XboxController joystick = new XboxController(0);
  public ExampleSubsystem() {
    frontLeft.setInverted(true);
    frontRight.setInverted(false);

    
  }
//para arcade drive chido
  public void ArcadeDrive(double speed, double rotSpeed) {
    drive.arcadeDrive(speed, rotSpeed);
    //x y rotacion con z
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
