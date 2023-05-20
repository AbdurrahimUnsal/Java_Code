package day33_constructors2;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();// used default constructor

        Car car2 = new Car("Honda", "Civic");// used customized constructor with two parameters

        System.out.println(car1.modal);//null
        System.out.println(car2.modal);//Civic

        Car car3 = new Car("Toyota", "corolla", 2016, 13000);

        System.out.println(car3.brand + " " + car3.modal +  " " + car3.year + " " + car3.price);

        // to print the entire object we created toString() method in the Car class

        System.out.println(car3);

    }
}
