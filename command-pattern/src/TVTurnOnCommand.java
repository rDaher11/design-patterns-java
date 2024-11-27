import Receivers.TV;

public class TVTurnOnCommand implements Command{

    private TV tv ;
    public TVTurnOnCommand(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
    @Override
    public void undo() {
        tv.turnOff();
    }
}
