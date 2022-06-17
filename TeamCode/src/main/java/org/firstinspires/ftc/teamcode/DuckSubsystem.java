package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.Motor;

public class DuckSubsystem extends SubsystemBase {

    private Motor DuckSpinner;

    public DuckSubsystem(Motor spinner) {
        DuckSpinner = spinner;
    }

    public void start(){
        DuckSpinner.set(1);
    }

    public void stop() {
        DuckSpinner.set(0);
    }


}
