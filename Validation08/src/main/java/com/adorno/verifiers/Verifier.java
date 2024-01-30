package com.adorno.verifiers;

public interface Verifier<T> {
	public boolean verify(T t);
}
