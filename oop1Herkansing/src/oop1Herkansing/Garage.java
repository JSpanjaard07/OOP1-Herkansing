package oop1Herkansing;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
	static int UniqueId = 0;
	public int MaxCapacity;
	public int id = 0;
	String StrId = String.valueOf(id);
	
	Scanner sc = new Scanner(System.in);
	
    public ArrayList<Car> ParkedCars = new ArrayList<>();
    
	public int CurrentCapacity = MaxCapacity - ParkedCars.size();

    public Garage(int mc) {
    	MaxCapacity = mc;
    	this.id = ++UniqueId;
	}
    
    public void ParkCar(Car car) {
    	ParkedCars.add(car);
    }
    
    public boolean CheckIfValid(Car car, License license) {
    	if (license.GetLicenseHolderPlate(car) == car.LicensePlate) {
    		if (license.CheckIfValidGarageId() == true) {
        		if (CurrentCapacity < MaxCapacity) {
        			System.out.println("Can park");
        			return true;
        		}
        		else {
        			return false;
        		}
        	}
    		return false;
    	}
    	return false;
    	
    }
    
    public int GetId() {
    	System.out.println(id);
    	return id;
    }
    
    
    
    public void GetCapacity() {
    	 System.out.println(CurrentCapacity);
    }
    
    public ArrayList<Car> GetCarsByModel(String ModelSearch) {
    	ArrayList<Car> cars = new ArrayList<Car>();
        for (Car Car : ParkedCars) {
            if (Car.GetModel() == ModelSearch) {
                return cars;
            }
        }
        return cars;
    }
    
    public ArrayList<Car> GetCarsByLicense(String LicenseSearch) {
    	ArrayList<Car> cars = new ArrayList<Car>();
        for (Car Car : ParkedCars) {
            if (Car.GetModel() == LicenseSearch) {
                return cars;
            }
        }
        return cars;
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
