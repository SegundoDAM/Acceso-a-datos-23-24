package com.adorno.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.adorno.modelo.Socio;
import com.adorno.verifiers.NombreSimpleVerifier;

@Service
public class SocioServiceMock {

	ArrayList<Socio> socios;
	private final NombreSimpleVerifier nombreSimpleVerifier;

	public SocioServiceMock(NombreSimpleVerifier nombreSimpleVerifier) {
		super();
		socios = new ArrayList<>();
		this.nombreSimpleVerifier = nombreSimpleVerifier;
	}

	public boolean add(Socio socio) {
		//Aqui socio ha pasado la validacion
		System.out.println("agregando nuevos socillos");
		if (nombreSimpleVerifier.verify(socio.getNombre())) {
			//aqui ha pasado la verificacion
			return socios.add(socio);
		}
		return false;
	}
}
