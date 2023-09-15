package org.inheritance;

public class TwoWheeler extends HierarchialInheritance {
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
		TwoWheeler t = new TwoWheeler();
		
		t.bikeName();
		t.bikePrice();
		t.bikeModel();
		t.vechileList();
	}

}
