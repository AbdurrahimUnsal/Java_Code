package day33_constructors2;

public class Car {
    String brand;
    String modal;
    int year;
    int price;

    public Car(){}; // Default const

    public Car(String brand, String modal){
        this.brand = brand;
        this.modal = modal;
    }

    public Car(String brand, String modal, int year, int price) {
        this.brand = brand;
        this.modal = modal;
        this.year = year;
        this.price = price;
    }

    @Override // to be able to print the entire object we created toString()
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modal='" + modal + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public Car(String a) {
        System.out.println("called another const.");
    }
}
