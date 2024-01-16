package com.adorno.repositories;

import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modelo.Jugador;
import com.adorno.modelo.Partido;

@SpringBootTest
class PartidoRepositorioTest {

	@Autowired
	PartidoRepositorio partidoRepositorio;
	@Autowired
	JugadorRepositorio jugadorRepositorio;

	@Test
	void test() {
		Jugador jugador1 = new Jugador("calvete");
		Jugador jugador2 = new Jugador("pies izquierdos");
		Partido partido = new Partido("semifinal");
		partido.addJugador(jugador1);
		partido.addJugador(jugador2);
		partidoRepositorio.save(partido);
		// encontrar a los jugadores por el partido
		Optional<Partido> partidoID = partidoRepositorio.findById(1L);
		partidoID.ifPresent((par) -> par.getJugadores().stream().forEach((jugador) -> {
			System.out.println(jugador.toString());
		}));
		// encontrar los partidos de un jugador
		partidoRepositorio.findAll().stream()
			.filter((part) -> {
				return part.getJugadores().contains(jugador1);
			}).collect(Collectors.toList())
				.forEach((par) -> System.err.println(par.toString()));
		
		//con bidireccionalidad
		jugadorRepositorio.findById(1L).ifPresent((jugadorr)->{
			jugadorr.getPartidos()
			.forEach(partidor-> System.out.println(partidor.toString()));
		});
	}

}
