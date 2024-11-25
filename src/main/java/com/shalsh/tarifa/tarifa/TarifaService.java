package com.shalsh.tarifa.tarifa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TarifaService {

	@Autowired
	private TarifaRepository tr;

	public ResponseEntity<?> actualizar(Tarifa t) {
		try {
			t = tr.save(t);
			return new ResponseEntity<>(t,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<?> obtenerTarifa() {
		try {
			return new ResponseEntity<>(tr.obtenerTarifa(new Date()).get(),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
