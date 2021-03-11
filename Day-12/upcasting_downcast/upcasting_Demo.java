package p1;
public class Vehicle{
    Speed(){
        System.out.println("Speed Limit 150 km/hr");
    }
}

class Car extends Vehicle{
    Speed_Car(){
        System.out.println("Speed Limit 200 km/hr");
    }
}

class Bike extends Vehicle{
    Speed_Bike(){
        System.out.println("Speed Limit 500 km/hr");
    }
}