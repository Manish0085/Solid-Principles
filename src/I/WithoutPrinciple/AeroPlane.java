package I.WithoutPrinciple;

public class AeroPlane implements Vehicle{
    @Override
    public void fly(String plane) {
        System.out.println(plane+" is flying");
    }

    @Override
    public void drive(String plane) {
        System.out.println(plane+" is running");
    }
}
