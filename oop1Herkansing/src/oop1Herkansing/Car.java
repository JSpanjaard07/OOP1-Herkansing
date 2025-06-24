package oop1Herkansing;

public class Car {
	public String LicensePlate;
	public String Brand;
	public static String Model;
	public String Color;
	static int UniqueId = 0;
	public int id = 0;
	
	
	public Car(String lp, String b, String m, String c) {
		LicensePlate = lp;
		Brand = b;
		Model = m;
		Color = c;
    	this.id = ++UniqueId;
	}
	
	public int GetId() {
        return id;
    }
	
	public String GetLicensePlate() {
		System.out.println(LicensePlate);
		return LicensePlate;		
	}
	
	public String GetBrand() {
		System.out.println(Brand);
		return Brand;		
	}
	
	public String GetModel() {
		System.out.println(Model);
		return Model;		
	}
	
	public String GetColor() {
		System.out.println(Color);
		return Color;		
	}

}
