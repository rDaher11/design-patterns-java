import Receivers.TV;

public class TVTurnOffCommand implements Command{
    private TV tv;

    public TVTurnOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
