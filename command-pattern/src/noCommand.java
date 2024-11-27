public class noCommand implements Command {
    public noCommand() {
    }

    @Override
    public void execute() {
        System.out.println("noCommand");
    }

    @Override
    public void undo() {
        System.out.println("noCommand");
    }
}
