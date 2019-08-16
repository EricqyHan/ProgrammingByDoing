package Variables;

public class VariablesAndNames1 {
    public static void main(String[] args) {

        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_cars, carPool_capacity, average_passenger_per_car;

        cars = 100;
        space_in_cars = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carPool_capacity = cars_driven * space_in_cars;
        average_passenger_per_car = passengers/cars_driven;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carPool_capacity + " poeple today.");
        System.out.println("We have " + passengers + " to carpoo; today.");
        System.out.println("We need to put about " + average_passenger_per_car + " in each car.");


    }
}
