
package mainclass;

class CarClass {
    int carId;
    String carName;
    double carSpeed;

    CarClass(String name, double speed, int Id)
    {
        this.carName = name;
        this.carSpeed = speed;
        this.carId = Id;
    }
}
class Driver {
    String driverName;
    int driverAge;
    Driver(String name, int age) {
        this.driverName = name;
        this.driverAge = age;
    }
}
class TransportCompany {
    public static void main(String args[])
    {
        CarClass obj = new CarClass("Ford", 180.15, 9988);
        Driver obj2 = new Driver("Andy", 45);
        System.out.println(obj2.driverName+" is a driver of "+obj.carName+" with car Id: "+obj.carId);       
    }
}
