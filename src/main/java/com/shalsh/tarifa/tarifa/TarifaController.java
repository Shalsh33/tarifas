package com.shalsh.tarifa.tarifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarifa")
public class TarifaController {

	@Autowired
	TarifaService ts;
	
	@PostMapping("/actualizar")
	public ResponseEntity<?> actualizarTarifa(@RequestBody Tarifa t){
		return ts.actualizar(t);
	}
	
	@GetMapping()
	public ResponseEntity<?> obtenerTarifa(){
		return ts.obtenerTarifa();
	}
}
