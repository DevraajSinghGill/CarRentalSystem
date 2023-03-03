
public class Car {

    private String type;
    private String model;
    private int year;
    private double pricePerDay;
    private String status;

    public Car(String type, String model, int year, double pricePerDay, String status) {
        this.type = type;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
