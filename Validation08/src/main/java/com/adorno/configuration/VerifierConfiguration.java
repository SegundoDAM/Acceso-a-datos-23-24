package com.adorno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adorno.verifiers.NombreSimpleVerifier;

@Configuration
public class VerifierConfiguration {
	
	@Bean
	NombreSimpleVerifier getNombreSimpleVerifier() {
		return new NombreSimpleVerifier();
	}
}
