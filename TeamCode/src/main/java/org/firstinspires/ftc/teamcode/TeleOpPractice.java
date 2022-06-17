package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name = "TeleOpFile")

public class TeleOpPractice extends CommandOpMode{
    private GamepadEx gamepad;

    private Motor duckSpinner;

    //subsystem
    private DuckSubsystem duckSubsystem;

    //command
    private DuckCommand duckCommand;

    //Servo 
    private ArmCommand armCommand;
    private ArmSybsystem armSybsystem;


    @Override
    public void initialize() {
        duckSpinner = new Motor(hardwareMap, "dS");

        duckSubsystem = new DuckSubsystem(duckSpinner);
        duckCommand = new DuckCommand(duckSubsystem);

        gamepad = new GamepadEx(gamepad1);

        gamepad.getGamepadButton(GamepadKeys.Button.X).toggleWhenPressed(duckCommand);






    }





}
