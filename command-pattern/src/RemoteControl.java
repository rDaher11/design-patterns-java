import java.util.ArrayList;
public class RemoteControl {
    private Command []onCommands ;
    private Command []offCommands ;
    private ArrayList<Command> prevCommands  = new ArrayList<>() ;
    public RemoteControl(){
        /// assume that we had seven slots we need to program it to do something
        this.onCommands = new Command[7] ;
        this.offCommands = new Command[7] ;

        /// it's better than but a null value we assume that all slots has no commands
        noCommand noValue = new noCommand() ;
        for (int i = 0 ; i < onCommands.length ; i++) {
            onCommands[i] =  noValue;
            offCommands[i] = noValue ; 
        }
    }

    /// if you need to program a slot just send index of it and the turnoff and turn on command
    public void setCommand(int index , Command currentOnCommand , Command currentOffCommand){
        onCommands[index] = currentOnCommand ;
        offCommands[index] = currentOffCommand ;
    }


    /// what happen when on button is pushed
    public void onButtonWasPushed(int index) {
        onCommands[index].execute();
        prevCommands.add(onCommands[index]) ;

    }
    public void offButtonWasPushed(int index) {
        offCommands[index].execute();
        prevCommands.add(offCommands[index]) ;
    }

    /// what happen when on button is pushed
    public void undoButtonWasPushed() {
        if(prevCommands.isEmpty()) {
            noCommand nc = new noCommand() ;
            nc.undo();
        } else {
            prevCommands.get(prevCommands.size()-1).undo();
            prevCommands.remove(prevCommands.size()-1) ;
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n-------Remote Control -------\n");
        for (int i = 0 ; i < onCommands.length ; i++) {
            sb.append("[ slot [" + i + "] ]   " + onCommands[i].getClass().getName() +
                    " " + onCommands[i].getClass().getName() +
                    "\n");
        }
        return sb.toString();
    }
}
