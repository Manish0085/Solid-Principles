package S.WithPrinciple;

public class MarkerPrinter {

    private Marker marker;


    public MarkerPrinter(){
        marker = new Marker();
    }

    public void printMarker(S.Principle.WithoutPrinciple.Marker marker){
        System.out.println("This method prints marker");
        System.out.println(marker.getName());
        System.out.println(marker.getColor());
        System.out.println(marker.getAmount());
    }

}
