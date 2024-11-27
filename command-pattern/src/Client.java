import Receivers.GarageDoor;
import Receivers.Light;
import Receivers.TV;
// just testing class
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("living room");
        TV tv = new TV();
        GarageDoor garageDoor = new GarageDoor();

        GarageCloseDoorCommand garageCloseDoorCommand = new GarageCloseDoorCommand(garageDoor);
        GarageOpenDoorCommand  garageOpenDoorCommand = new GarageOpenDoorCommand(garageDoor);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVTurnOnCommand tvTurnOnCommand  = new TVTurnOnCommand(tv) ;
        TVTurnOffCommand tvTurnOffCommand = new TVTurnOffCommand(tv) ;

        remoteControl.setCommand(0 ,garageOpenDoorCommand , garageCloseDoorCommand);
        remoteControl.setCommand(1,lightOnCommand , lightOffCommand);
        remoteControl.setCommand(4,tvTurnOnCommand , tvTurnOffCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();


    }
}
