package oop1Herkansing;

public class License {

	static int UniqueId = 0;
	public int id = 0;
	public static Car LicenseHolder;
	public static int ValidGarageId;
	public String LP;
	
	
	public License(Car lh, int vg) {
		LicenseHolder = lh;
		ValidGarageId = vg;
    	this.id = ++UniqueId;
	}

	public String GetLicenseHolderPlate(Car car) {
		LP = car.GetLicensePlate();
		return LP;
	}
	
	public boolean CheckIfValidGarageId() {
		if (ValidGarageId == Garage.UniqueId) {
			System.out.println("Valid");
			return true;
		}
		else {
			System.out.println("Invalid");
			return false;
		}
	}
	
	
}
