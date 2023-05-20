package day24scope_and_arrays;

public class ADoctor {
    //Class level instance variables for doctor


    String name;
    String lastName;
    int bDay;
    boolean onVocation;
    String phoneNumber;

    //Static class level variables
    static String nameOfHospital = "Star Hospital";
    static String hospitalPhoneNumber = "3456789898";

    @Override
    public String toString() {
        return "ADoctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bDay=" + bDay +
                ", onVocation=" + onVocation +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
