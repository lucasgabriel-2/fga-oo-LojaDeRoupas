package control;

import java.util.ArrayList;

import model.*;

public class ControleRoupa {
	
	private ArrayList<Roupa> rc = new ArrayList<>();
	private ArrayList<Roupa> rv = new ArrayList<>();
	
	public ControleRoupa (ControleDados d) {
		rc = d.getRoupasCompradas();
		rv = d.getRoupasAVenda();
	}
	
	//Coloca uma roupa a venda
	public boolean cadastrarRoupa(String[] dadosRoupa, Usuario usuario) {
		
		Roupa roupa = new Roupa (dadosRoupa[0], dadosRoupa[1], dadosRoupa[2], dadosRoupa[3], Double.parseDouble(dadosRoupa[4]), 
		dadosRoupa[5], dadosRoupa[6], usuario, dadosRoupa[7], dadosRoupa[8], dadosRoupa[9]);
		
		roupa.setImagem("img/Placeholder.png");
		
		ControleDados.getD().getRoupasAVenda().add(roupa);
		return true;
	}
	
	//Salva os dados editados de uma roupa
	public boolean salvarRoupa(String[] dadosAcessorio, Usuario usuario, int posicao) {
		ControleDados.getD().getRoupasAVenda().get(posicao).setNome(dadosAcessorio[0]);
		ControleDados.getD().getRoupasAVenda().get(posicao).setDepartamento(dadosAcessorio[1]);
		ControleDados.getD().getRoupasAVenda().get(posicao).setDescricao(dadosAcessorio[2]);
		ControleDados.getD().getRoupasAVenda().get(posicao).setMarca(dadosAcessorio[3]);
		ControleDados.getD().getRoupasAVenda().get(posicao).setPreco(Double.parseDouble(dadosAcessorio[4]));
		ControleDados.getD().getRoupasAVenda().get(posicao).setCondicao(dadosAcessorio[5]);
		ControleDados.getD().getRoupasAVenda().get(posicao).setCor(dadosAcessorio[6]);

		ControleDados.getD().getRoupasAVenda().get(posicao).setTamanho(dadosAcessorio[7]);
		ControleDados.getD().getRoupasAVenda().get(posicao).setTecido(dadosAcessorio[8]);
		ControleDados.getD().getRoupasAVenda().get(posicao).setEstampa(dadosAcessorio[9]);

		return true;
	}
	
	//Deleta uma roupa ja existente
	public void excluirRoupa(int posicao) {
		for(int i = 0; i < ControleDados.getD().getUsuarioPrincipal().getSacolausuario().getSacolaParaRoupas().size(); i++){
			if(ControleDados.getD().getUsuarioPrincipal().getSacolausuario().getSacolaParaRoupas().get(i) ==
			ControleDados.getD().getRoupasAVenda().get(posicao)) {
				//Tira as roupas compradas de Roupas Venda
				ControleDados.getD().getUsuarioPrincipal().getSacolausuario().getSacolaParaRoupas().remove(i);
			}
		}
		
		ControleDados.getD().getRoupasAVenda().remove(posicao);
	}

	//Gets e sets
	public ArrayList<Roupa> getAc() {
		return rc;
	}

	public void setAc(ArrayList<Roupa> rc) {
		this.rc = rc;
	}

	public ArrayList<Roupa> getAv() {
		return rv;
	}

	public void setAv(ArrayList<Roupa> rv) {
		this.rv = rv;
	}
	
	public String getNomeAC(int i) {
		return rc.get(i).getNome();
	}
	
	public String getDepartamentoAC(int i) {
		return rc.get(i).getDepartamento();
	}
	
	public String getDescricaoAC(int i) {
		return rc.get(i).getDescricao();
	}
	
	public String getMarcaAC(int i) {
		return rc.get(i).getMarca();
	}
	
	public Double getPrecoAC(int i) {
		return rc.get(i).getPreco();
	}
	
	public String getCondicaoAC(int i) {
		return rc.get(i).getCondicao();
	}
	
	public String getCorAC(int i) {
		return rc.get(i).getCor();
	}

	public Usuario getUsuarioAC(int i) {
		return rc.get(i).getUsuario();
	}
	
	public String getTamanhoAC(int i) {
		return rc.get(i).getTamanho();
	}
	
	public String getTecidoAC(int i) {
		return rc.get(i).getTecido();
	}
	
	public String EstampaAC(int i) {
		return rc.get(i).getEstampa();
	}
	
	public String getNomeAV(int i) {
		return rv.get(i).getNome();
	}
	
	public String getDepartamentoAV(int i) {
		return rv.get(i).getDepartamento();
	}
	
	public String getDescricaoAV(int i) {
		return rv.get(i).getDescricao();
	}
	
	public String getMarcaAV(int i) {
		return rv.get(i).getMarca();
	}
	
	public Double getPrecoAV(int i) {
		return rv.get(i).getPreco();
	}
	
	public String getCondicaoAV(int i) {
		return rv.get(i).getCondicao();
	}
	
	public String getCorAV(int i) {
		return rv.get(i).getCor();
	}

	public Usuario getUsuarioAV(int i) {
		return rv.get(i).getUsuario();
	}
	
	public String getTamanhoAV(int i) {
		return rv.get(i).getTamanho();
	}
	
	public String getTecidoAV(int i) {
		return rv.get(i).getTecido();
	}
	
	public String EstampaAV(int i) {
		return rv.get(i).getEstampa();
	}

}