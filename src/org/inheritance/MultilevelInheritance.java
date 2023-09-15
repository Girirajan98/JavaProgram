package org.inheritance;

public class MultilevelInheritance extends SingleInheritance {
	
	public  void bikeName() {
		System.out.println("The bike name is Duke");
	}
	

	public  void bikePrice() {
		System.out.println("The car price is 2Lpa");
	}

	public  void bikeModel() {
		System.out.println("The car Model is 2021");
	}
	
	public static void main(String[] args) {
		
		MultilevelInheritance s = new MultilevelInheritance();
		
		s.carName();
		s.carPrice();
		s.carModel();
		s.bikeName();
		s.bikeModel();
		s.bikePrice();
		
		
	}

}
