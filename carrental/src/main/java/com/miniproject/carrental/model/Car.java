package com.miniproject.carrental.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String carname, String carnum, String cartype, String ownername) {
		super();
		this.carname = carname;
		this.carnum = carnum;
		this.cartype = cartype;
		this.ownername = ownername;
	}
	private String carname;
	@Id
	private String carnum;
	private String cartype;
	private String ownername;
	
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCarnum() {
		return carnum;
	}
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	

}
