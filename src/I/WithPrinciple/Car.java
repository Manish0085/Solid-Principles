package I.WithPrinciple;



public class Car implements Drivable {

    @Override
    public void drive(String vehicle) {
        System.out.println(vehicle+" runs");
    }
}
