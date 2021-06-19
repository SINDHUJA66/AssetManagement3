package com.asset.management.entity;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
	@Table(name = "asset_request")
	public class Allocation {
	@Id
	private Long aid;
	@DateTimeFormat(pattern="dd/mm//yyyy")
	private Date allocation_date;
	private String status;
	public Allocation() {
		super();
		
	}
	@Override
	public String toString() {
		return "Allocation [aid=" + aid + ", allocation_date=" + allocation_date + ", status=" + status + "]";
	}
	public Long getAid() {
		return aid;
	}
	public void setAid(Long aid) {
		this.aid = aid;
	}
	public Date getAllocation_date() {
		return allocation_date;
	}
	public void setAllocation_date(Date allocation_date) {
		this.allocation_date = allocation_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Allocation(Long aid, Date allocation_date, String status) {
		super();
		this.aid = aid;
		this.allocation_date = allocation_date;
		this.status = status;
	}
	
}