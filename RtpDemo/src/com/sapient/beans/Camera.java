package com.sapient.beans;

public class Camera extends Product{
	
	private String lens;

	public Camera(int pid, String pname, double price, String lens) {
		super(pid, pname, price);
		this.lens = lens;
	}

	@Override
	public String IsExpensive() {
		// TODO Auto-generated method stub
		if (getPrice() >= 10000)
			return "expensive";
		else
			return "average";
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return super.display()+" "+lens;
	}

 
}
