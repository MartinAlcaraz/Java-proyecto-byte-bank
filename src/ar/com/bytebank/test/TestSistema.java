package ar.com.bytebank.test;

import ar.com.bytebank.modelo.*;

public class TestSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setContraseña(222);
		Designer disenador = new Designer();
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autenticar(gerente);
		
	}
}
