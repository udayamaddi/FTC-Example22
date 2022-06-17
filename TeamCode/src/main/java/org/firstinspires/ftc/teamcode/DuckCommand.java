package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandBase;

public class DuckCommand extends CommandBase {
    DuckSubsystem subsystem;
    public DuckCommand(DuckSubsystem sub){
        subsystem = sub;
        addRequirements(subsystem);
        }

        @Override

        public void initialize(){
            subsystem.start();
        }

        @Override

        public void end(boolean interrupted){
            subsystem.stop();
        }


}
