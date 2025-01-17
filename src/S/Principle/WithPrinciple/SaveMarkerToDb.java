package S.Principle.WithPrinciple;

public class SaveMarkerToDb {

    private Marker marker;

    public SaveMarkerToDb(){
        marker = new Marker();
    }

    public void saveInDb(Marker marker){
        System.out.println("This method saves the marker into DB");
    }
}
