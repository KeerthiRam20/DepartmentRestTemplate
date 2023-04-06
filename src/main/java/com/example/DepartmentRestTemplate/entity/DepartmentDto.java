package com.example.DepartmentRestTemplate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentDto{
	
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String departmentName;
	    private String departmentAddress;
	    private String departmentCode;
	    
	   
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public String getDepartmentAddress() {
			return departmentAddress;
		}
		public void setDepartmentAddress(String departmentAddress) {
			this.departmentAddress = departmentAddress;
		}
		public String getDepartmentCode() {
			return departmentCode;
		}
		public void setDepartmentCode(String departmentCode) {
			this.departmentCode = departmentCode;
		}
		
		public DepartmentDto() {
			
		}
		
		public DepartmentDto(int id, String departmentName, String departmentAddress, String departmentCode) {
			this.id = id;
			this.departmentName = departmentName;
			this.departmentAddress = departmentAddress;
			this.departmentCode = departmentCode;
		}
		@Override
		public String toString() {
			return "DepartmentDto [id=" + id + ", departmentName=" + departmentName
					+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
		}
	    
	    

}
