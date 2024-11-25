package com.shalsh.tarifa.tarifa;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer> {

	@Query("SELECT new com.shalsh.tarifa.tarifa.TarifaDTO(f.tarifa,f.tarifa_pausa) FROM Tarifa f "
			+ "WHERE f.fecha_desde < :now "
			+ "ORDER BY f.fecha_desde DESC "
			+ "LIMIT 1")
	Optional<TarifaDTO> obtenerTarifa(Date now);

}
