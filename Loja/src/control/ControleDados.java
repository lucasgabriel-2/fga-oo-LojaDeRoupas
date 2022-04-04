package control;

import java.util.ArrayList;

import model.*;

public class ControleDados {
	
	private static Dados d = new Dados();
	
	public ControleDados() {
		d.precadastros();
	}

	//Gets e sets
	public static Dados getD() {
		return d;
	}

	public void setD(Dados d) {
		ControleDados.d = d;
	}
	
	public Usuario getUsuarioPrincipal() {
		return ControleDados.d.getUsuarioPrincipal();
	}

	public ArrayList<Usuario> getUsuarios() {
		return ControleDados.d.getUsuarios();
	}
	
	public ArrayList<Acessorio> getAcessoriosComprados() {
		return ControleDados.d.getAcessoriosComprados();
	}
	
	public ArrayList<Roupa> getRoupasCompradas() {
		return ControleDados.d.getRoupasCompradas();
	}
	
	public ArrayList<Acessorio> getAcessoriosAVenda() {
		return ControleDados.d.getAcessoriosAVenda();
	}
	
	public ArrayList<Roupa> getRoupasAVenda() {
		return ControleDados.d.getRoupasAVenda();
	}
	
}