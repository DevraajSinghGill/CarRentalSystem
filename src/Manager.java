
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public final class Manager {

    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Car> cars = new ArrayList<>();
    static ArrayList<RentCar> rentedCars = new ArrayList<>();
    static User currentUser;
    static Scanner sc;
    static FileWriter fw;

    public Manager() {
        fetchDataFromFiles();
    }

    public void fetchDataFromFiles() {
        users.clear();
        readUsers();
        cars.clear();
        readCars();
        rentedCars.clear();
        readRentedCars();
    }

    private void readUsers() {

        try {
            sc = new Scanner(new File("users.txt"));
            while (sc.hasNext()) {
                String line[] = sc.nextLine().split(";;;");
                users.add(new User(line[0], line[1], line[2], line[3], line[4]));
            }
        } catch (FileNotFoundException ex) {
            //System.out.println(ex.getMessage());
        }

    }

    private void readCars() {
        try {
            sc = new Scanner(new File("cars.txt"));
            while (sc.hasNext()) {
                String line[] = sc.nextLine().split(";;;");
                cars.add(new Car(line[0], line[1], Integer.parseInt(line[2]),
                        Double.parseDouble(line[3]), line[4]));
            }
        } catch (FileNotFoundException ex) {
            //System.out.println(ex.getMessage());
        }
    }

    private void readRentedCars() {
        try {
            sc = new Scanner(new File("rentedCars.txt"));
            while (sc.hasNext()) {
                String line[] = sc.nextLine().split(";;;");
                rentedCars.add(new RentCar(line[0], new Car(line[1], line[2],
                        Integer.parseInt(line[3]), Double.parseDouble(line[4]), ""),
                        line[5], Integer.parseInt(line[6]),
                        Double.parseDouble(line[7]), line[8], line[9]));
            }
        } catch (FileNotFoundException ex) {
            //System.out.println(ex.getMessage());
        }
    }

    public static void saveUsers() {

        try {
            fw = new FileWriter(new File("users.txt"));
            for (User user : users) {
                fw.write(user.getNIC() + ";;;" + user.getEmail() + ";;;"
                        + user.getPassword() + ";;;" + user.getName() + ";;;"
                        + user.getGender() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void saveCars() {
        try {
            fw = new FileWriter(new File("cars.txt"));
            for (Car car : cars) {
                fw.write(car.getType() + ";;;" + car.getModel() + ";;;"
                        + car.getYear() + ";;;" + car.getPricePerDay() + ";;;"
                        + car.getStatus() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void saveRentedCars() {
        try {
            fw = new FileWriter(new File("rentedCars.txt"));
            for (RentCar rc : rentedCars) {
                fw.write(rc.getUserEmail() + ";;;" + rc.getCar().getType()
                        + ";;;" + rc.getCar().getModel() + ";;;"
                        + rc.getCar().getYear() + ";;;"
                        + rc.getCar().getPricePerDay() + ";;;" + rc.getDate()
                        + ";;;" + rc.getDays() + ";;;" + rc.getTotalPrice() + ";;;"
                        + rc.getStatus() + ";;;" + rc.getPaymentMethod() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
