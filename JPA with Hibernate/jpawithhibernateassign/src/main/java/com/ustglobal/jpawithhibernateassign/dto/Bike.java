package com.ustglobal.jpawithhibernateassign.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bike")
public class Bike {

	@Id
	@Column
	private int bid;

	@Column
	private String bname; 

	@Column
	private String bmodel;

	@Column
	private int bprice;


	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBmodel() {
		return bmodel;
	}

	public void setBmodel(String bmodel) {
		this.bmodel = bmodel;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
}
