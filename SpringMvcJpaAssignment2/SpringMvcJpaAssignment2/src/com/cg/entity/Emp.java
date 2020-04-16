package com.cg.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="lpu_emp")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Emp {
	@Id
	@Column(name="eid")
	private int empId;
	
	@Column(name="ename",length=25)
	private String empName;
	
	@Column(name="esal")
	private double empSal;
	
	@DateTimeFormat(pattern="yyyy-M-d")
	private LocalDate doj;
	
	@Transient
	private String strDoj;
	
	@ManyToOne
	@JoinColumn(name="dept_id",referencedColumnName = "did")
	private Dept dept;
	
	
	
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		System.out.println("DOJ"+strDoj);
		DateTimeFormatter dtFormatter=DateTimeFormatter.ofPattern("yyyy-M-d");
		this.doj = LocalDate.parse(doj,dtFormatter);
	}
	public String getStrDoj() {
		DateTimeFormatter dtFormatter=DateTimeFormatter.ofPattern("d-MMM-yyyy");
		this.strDoj=doj.format(dtFormatter);
		return this.strDoj;
	}
	public void setStrDoj(String strDoj) {
		this.strDoj = strDoj;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
	
		return empId+" "+empName+" "+empSal+" "+dept+" "+doj;
	}
	
	

}
