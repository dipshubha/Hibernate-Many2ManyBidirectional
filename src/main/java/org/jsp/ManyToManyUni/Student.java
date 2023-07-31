
package org.jsp.ManyToManyUni;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private double perc;

	// .................using this line Many2Many bidirectional ............only student...............  
	//........eta dile 4 ta table create habe...ar eta na dile 3 ta table create habe............. 
	//	@ManyToMany
//	private List<Batch> batchs;
//
//	public List<Batch> getBatchs() {
//		return batchs;
//	}
//
//	public void setBatchs(List<Batch> batchs) {
//		this.batchs = batchs;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

}
