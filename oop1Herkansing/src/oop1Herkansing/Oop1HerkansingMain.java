package oop1Herkansing;

public class Oop1HerkansingMain {

	public static void main(String[] args) {
		Car One = new Car("123", "BMW", "Twenty", "Blue");
		Garage Klokstraat = new Garage(16);
		Garage LittleStJames = new Garage(2);
		License KlokstraatLicense = new License(One, 2);
		
		//System.out.println(Klokstraat.UniqueId);
		//System.out.println(KlokstraatLicense.ValidGarageId);
		
		One.GetBrand();
		System.out.println(Klokstraat.ParkedCars);
		Klokstraat.GetId();
		LittleStJames.GetId();
		Klokstraat.ParkCar(One);
        Klokstraat.GetCarsByModel("Twenty");
        KlokstraatLicense.GetLicenseHolderPlate(One);
        KlokstraatLicense.CheckIfValidGarageId();
        Klokstraat.CheckIfValid(One, KlokstraatLicense);


	}

}
