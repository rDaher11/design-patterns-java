import Receivers.GarageDoor;

public class GarageCloseDoorCommand implements Command {
    GarageDoor garageDoor ;
    public GarageCloseDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.CloseGarageDoor();
    }

    @Override
    public void undo() {
        garageDoor.OpenGarageDoor();
    }
}
