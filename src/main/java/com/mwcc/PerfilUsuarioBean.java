package com.mwcc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<String> estados = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();

	private String nome;
	private String estado;
	private String cidade;

	public PerfilUsuarioBean() {
		estados.add("MG");
		estados.add("SP");
		estados.add("MA");
		estados.add("RJ");
	}

	public void carregarCidades() {
		cidades.clear();

		if ("MG".equals(estado)) {
			cidades.add("Uberlandia");
			cidades.add("Uberaba");
			cidades.add("Belo Horizonte");
		} else {
			if ("SP".equals(estado)) {
				cidades.add("São Paulo");
				cidades.add("Guarulhos");
				cidades.add("São Bernardo do Campo");
				cidades.add("Santo André");
				cidades.add("Ribeirão Preto");
			} else {
				if ("MA".equals(estado)) {
					cidades.add("São luis");
					cidades.add("Paco do Lumiar");
					cidades.add("São Jose de Ribamar");
				} else {
					if ("RJ".equals(estado)) {
						cidades.add("Rio de Janeiro");
						cidades.add("Niteroi");
					}
				}
			}
		}
	}

	public void atualizar() {
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade: " + this.cidade);

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public void setCidades(List<String> cidades) {
		this.cidades = cidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

}
