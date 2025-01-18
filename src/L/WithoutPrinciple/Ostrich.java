package L.WithoutPrinciple;

public class Ostrich extends Bird{



    @Override
    public void fly(String bird){
        throw new UnsupportedOperationException(bird+ " doesn't fly");
    }

}
