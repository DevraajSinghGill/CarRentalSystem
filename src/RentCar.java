
import java.text.SimpleDateFormat;
import java.util.Date;

public class RentCar {

    private final String userEmail;
    private final Car car;
    private final String date;
    private final int days;
    private double totalPrice;
    private String status;
    private String paymentMethod;
    
     // constructor overloading//
    public RentCar(String userEmail, Car car, int days, String paymentMethod) {
        this.userEmail = userEmail;
        this.car = car;
        this.days = days;
        this.status = "Booking Request";
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        this.paymentMethod = paymentMethod;
    }

    public RentCar(String userEmail, Car car, String date, int days,
            double totalPrice, String status, String paymentMethod) {
        this.userEmail = userEmail;
        this.car = car;
        this.date = date;
        this.days = days;
        this.totalPrice = totalPrice;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Car getCar() {
        return car;
    }

    public String getDate() {
        return date;
    }

    public int getDays() {
        return days;
    }

    public double getTotalPrice() {
        return days * car.getPricePerDay();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
