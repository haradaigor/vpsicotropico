package vpsicotropico.model.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import vpsicotropico.model.entities.enums.drug.TherapeutiCclass;

public abstract class ControlledDrug {
	
	
	@Enumerated(EnumType.ORDINAL)
	private TherapeutiCclass therapeuticClass;
	private String name;
	
	
	public ControlledDrug() {
		
	}
	
	public ControlledDrug(TherapeutiCclass therapeuticClass, String name) {
		this.therapeuticClass = therapeuticClass;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TherapeutiCclass getTherapeuticClass() {
		return therapeuticClass;
	}
	
	
	
}
