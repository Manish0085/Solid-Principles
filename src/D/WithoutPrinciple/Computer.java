package D.WithoutPrinciple;

public class Computer {

    private KeyBoard keyBoard;

    private Monitor monitor;

    public Computer(){
        keyBoard = new KeyBoard();
        monitor = new Monitor();
    }

    public void execute(){
        String content = keyBoard.getInput();
        monitor.display(content);
    }
}
