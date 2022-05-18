package vpsicotropico.model.entities;

import jakarta.persistence.Entity;
import vpsicotropico.model.entities.enums.drug.MedicineUnitMeasure;
import vpsicotropico.model.entities.enums.drug.TherapeutiCclass;

@Entity
public class Medicine extends ControlledDrug {
	
	
	private String registerNumber;
	private MedicineUnitMeasure unitMeasure;
	
	public Medicine() {
		super();
	}
	
	public Medicine(TherapeutiCclass therapeuticClass, String name, String registerNumber, MedicineUnitMeasure unitMeasure) {
		super(therapeuticClass, name);
		this.registerNumber = registerNumber;
		this.unitMeasure = unitMeasure;
	}
	
	

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public MedicineUnitMeasure getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(MedicineUnitMeasure unitMeasure) {
		this.unitMeasure = unitMeasure;
	}
	
	
	
	
	

}
