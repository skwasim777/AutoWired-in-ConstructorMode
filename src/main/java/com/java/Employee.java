package com.java;

public class Employee {
	private int eId;
	private String eName;
	private String eEmail;
	private Address addr;

	public Employee() {
	
	}

	public Employee(int eId, String eName, String eEmail, Address addr) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eEmail = eEmail;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eEmail=" + eEmail + ", addr=" + addr + "]";
	}

}
