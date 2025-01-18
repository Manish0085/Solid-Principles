package D.WithPrinciple;

public class Monitor implements OutputDevice{
    @Override
    public void display(String content) {
        System.out.println("User input "+content);
    }
}
