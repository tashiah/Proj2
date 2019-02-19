package com.program.demo.model;

public class Employee {

	private Integer id;
	private String name;
	private String dept;
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
        return "Employee [id=" + id + ", name=" + name
                + ", dept=" + dept + ", address=" + address + "]";
        
	}
	
}
