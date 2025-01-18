package I.WithPrinciple;


public class AeroPlane implements Drivable, Flyable {
    @Override
    public void fly(String plane) {
        System.out.println(plane+" is flying");
    }

    @Override
    public void drive(String plane) {
        System.out.println(plane+" is running");
    }
}
