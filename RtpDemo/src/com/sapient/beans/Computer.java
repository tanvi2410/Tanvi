package com.sapient.beans;

public class Computer extends Product {

	private String mboard;

	public Computer(int pid, String pname, double price, String mboard) {
		super(pid, pname, price);
		this.mboard = mboard;
	}

	@Override
	public String IsExpensive() {
		// TODO Auto-generated method stub
		if (getPrice() >= 45000)
			return "expensive";
		else
			return "average";
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display()+" "+mboard;
	}
	
	

}
