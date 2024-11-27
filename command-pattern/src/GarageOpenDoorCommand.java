import Receivers.GarageDoor;

public class GarageOpenDoorCommand  implements Command {

    GarageDoor garageDoor ;
    public GarageOpenDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.OpenGarageDoor();
    }

    @Override
    public void undo() {
        garageDoor.CloseGarageDoor();
    }
}
