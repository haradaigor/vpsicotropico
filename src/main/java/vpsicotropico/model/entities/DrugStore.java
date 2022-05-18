package vpsicotropico.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="drugstore")
public class DrugStore {
	
	@Id
	private String cnpj;
	
	
	private Address address;
	private String companyName;
	
	@OneToMany
	private Inventory inventory;
}
