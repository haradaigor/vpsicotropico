package vpsicotropico.model.entities;

import jakarta.persistence.Entity;
import vpsicotropico.model.entities.enums.drug.TherapeutiCclass;
import vpsicotropico.model.entities.enums.drug.UnitMeasureInputMedicine;

@Entity
public class InputMedicine extends ControlledDrug {
	
	private Integer dcb;
	private UnitMeasureInputMedicine unitMeasure;
	
	public InputMedicine() {
		super();
	}
	
	public InputMedicine(TherapeutiCclass therapeuticClass, String name, Integer dcb, UnitMeasureInputMedicine unitMeasure) {
		super(therapeuticClass, name);
		this.dcb = dcb;
		this.unitMeasure = unitMeasure;
	}

	public Integer getDcb() {
		return dcb;
	}

	public void setDcb(Integer dcb) {
		this.dcb = dcb;
	}

	public UnitMeasureInputMedicine getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(UnitMeasureInputMedicine unitMeasure) {
		this.unitMeasure = unitMeasure;
	}
	
	
}
