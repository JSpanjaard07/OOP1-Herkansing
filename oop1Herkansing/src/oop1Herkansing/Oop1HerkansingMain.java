package oop1Herkansing;

public class Oop1HerkansingMain {

	public static void main(String[] args) {
		Car One = new Car("123", "BMW", "I8 E-Drive", "Blue");
		Garage Klokstraat = new Garage(16);
		Garage LittleStJames = new Garage(2);
		
		One.GetBrand();
		System.out.println(Klokstraat.ParkedCars);
		Klokstraat.GetId();
		LittleStJames.GetId();
		Klokstraat.ParkCar(One);
        System.out.println("Model of car with ID 0: " + Klokstraat.GetModel(1));


	}

}
