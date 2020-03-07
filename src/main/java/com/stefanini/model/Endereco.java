package com.stefanini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_ENDERECO")
	private Long id;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "CO_SEQ_PESSOA", insertable = true, updatable = true)  
	private Pessoa pessoa;
	
	
	@NotNull
	@Column(name = "DS_LOGRADOURO")
	private String logradouro;
	
	@NotNull
	@Column(name = "DS_COMPLEMENTO")
	private String complemento;
	
	@NotNull
	@Column(name = "DS_BAIRRO")
	private String bairro;
	
	@NotNull
	@Column(name = "DS_CIDADE")
	private String cidade;
	
	@NotNull
	@Column(name = "CO_UF")
	private String uf;
	
	@NotNull
	@Column(name = "DS_CEP")
	private String cep;
	
	
	public Endereco() {
	}

	public Endereco(@NotNull String logradouro, @NotNull String complemento, @NotNull String cidade, @NotNull String bairro, @NotNull String uf,@NotNull String cep) {
		super();
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.uf = uf;
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "";
//				"Endereco [id=" + id + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento
//				+ ", situacao=" + situacao + "]";
	}
	
}
