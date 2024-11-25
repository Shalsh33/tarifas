package com.shalsh.tarifa.tarifa;

public class TarifaDTO {
	
	private double tarifa;
	private double tarifa_pausa;

	

	public TarifaDTO() {
		
	}

	public TarifaDTO(double tarifa, double tarifa_pausa) {
		this.tarifa = tarifa;
		this.tarifa_pausa = tarifa_pausa;
	}

	public double getTarifa_pausa() {
		return tarifa_pausa;
	}

	public void setTarifa_pausa(double tarifa_pausa) {
		this.tarifa_pausa = tarifa_pausa;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
}
