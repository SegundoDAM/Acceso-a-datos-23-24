package com.adorno.verifiers;

public class NombreSimpleVerifier implements Verifier<String> {

	@Override
	public boolean verify(String t) {
		return !t.contains(" ");
	}

}
