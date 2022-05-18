package vpsicotropico.model.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Date initialDate;
	private List<Batch> batchStock;
	
	public Inventory() {
		
	}
	
	public Inventory(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Integer getId() {
		return id;
	}

	public Date getInitialDate() {
		return initialDate;
	}
	
	public void out() {
		
	}
	
	public void in() {
		
	}
	
	public List<Batch> getAllBatches(){
		return null;
	}
}
