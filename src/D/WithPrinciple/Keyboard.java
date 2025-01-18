package D.WithPrinciple;

import java.util.Scanner;

public class Keyboard implements InputDevice{
    @Override
    public String getInput() {
        Scanner sc = new Scanner(System.in);
        String content = sc.next();
        return content;
    }
}
