package L.WithPrinciple;

public class Pigeon implements Bird, FlyBird{
    @Override
    public void sound(String bird) {
        System.out.println(bird+" sounds");
    }

    @Override
    public void fly(String bird) {
        System.out.println(bird+"flies");
    }
}
