package vpsicotropico.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.ORDINAL)
	private ControlledDrug controlledDrug;
	private Integer quantity;
	
	public Item() {
		
	}
	
	public Item(ControlledDrug controlledDrug, Integer quantity) {
		this.controlledDrug = controlledDrug;
		this.quantity = quantity;
	}
	
	
}
