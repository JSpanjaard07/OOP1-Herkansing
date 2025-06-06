package oop1Herkansing;

import java.util.ArrayList;

public class Garage {
	static int UniqueId = 0;
	public int MaxCapacity;
	public int id = 0;
	String StrId = String.valueOf(id);
	
    public ArrayList<Car> ParkedCars = new ArrayList<>();
    
	public int CurrentCapacity = MaxCapacity - ParkedCars.size();

    public Garage(int mc) {
    	MaxCapacity = mc;
    	this.id = ++UniqueId;
	}
    
    public void ParkCar(Car car) {
    	ParkedCars.add(car);
    }
    
    public boolean CheckIfValid() {
    	if (MaxCapacity > 0) {
    		
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public int GetId() {
    	System.out.println(id);
    	return id;
    }
    
    public void GetCapacity() {
    	 System.out.println(CurrentCapacity);
    }
    
    public String GetModel(int id) {
        for (Car Car : ParkedCars) {
            if (Car.GetId() == id) {
                return Car.GetModel();
            }
        }
        return "Car with ID " + id + " not found.";
    }
    
    public String GetLicense(int id) {
        for (Car Car : ParkedCars) {
            if (Car.GetId() == id) {
                return Car.GetLicensePlate();
            }
        }
        return "Car with id " + id + " not found.";
    }
}
