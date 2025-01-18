package S.WithoutPrinciple;

public class Operation {

    private Marker marker;

    public Operation(){
       marker = new Marker();
    }

    public void printMarker(Marker marker){
        System.out.println("This method prints marker");
        System.out.println(marker.getName());
        System.out.println(marker.getColor());
        System.out.println(marker.getAmount());
    }

    public void saveInDb(Marker marker){
        System.out.println("This method saves the marker into DB");
    }
}
