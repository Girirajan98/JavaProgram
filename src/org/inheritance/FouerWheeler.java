package org.inheritance;

public class FouerWheeler extends HierarchialInheritance {
	
	public  void carName() {
		System.out.println("The car name is Skoda");
	}
	

	public  void carPrice() {
		System.out.println("The car price is 17Lpa");
	}

	public  void carModel() {
		System.out.println("The car Model is 2022");
	}
	
	public static void main(String[] args) {
		
		FouerWheeler f = new FouerWheeler();
		
		f.carName();
		f.carPrice();
		f.carModel();
		f.vechileList();
	}

}
