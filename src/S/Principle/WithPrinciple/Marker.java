package S.Principle.WithPrinciple;

public class Marker {

    private String name;
    private String color;
    private double amount;

    public Marker() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Marker(String name, String color, double amount){
        this.name = name;
        this.color = color;
        this.amount = amount;
    }
}
