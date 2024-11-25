package com.shalsh.tarifa.tarifa;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarifa")
public class Tarifa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column()
	private double tarifa;
	
	@Column()
	private double tarifa_pausa;
	
	@Column()
	private Date fecha_desde;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getTarifa_pausa() {
		return tarifa_pausa;
	}

	public void setTarifa_pausa(double tarifa_pausa) {
		this.tarifa_pausa = tarifa_pausa;
	}

	public Date getFecha_desde() {
		return fecha_desde;
	}

	public void setFecha_desde(Date fecha_desde) {
		this.fecha_desde = fecha_desde;
	}
	
	
}
