package I.WithoutPrinciple;

public class Car implements Vehicle{
    @Override
    public void fly(String vehicle) {
        throw new UnsupportedOperationException(vehicle+" doesn't fly");
    }

    @Override
    public void drive(String vehicle) {
        System.out.println(vehicle+" runs");
    }
}
