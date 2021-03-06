package com.stefanini.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity  
class PessoaPerfil implements Serializable{  
    
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_PESSOA_PERFIL")
	private Long id;
	
	@Id
    @ManyToOne  
    @JoinColumn(name = "CO_SEQ_PESSOA", insertable = true, updatable = true)  
    private Pessoa pessoa;  
  
    @Id
    @ManyToOne  
    @JoinColumn(name = "CO_SEQ_PERFIL", insertable = true, updatable = true)  
    private Perfil perfil;

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

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
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
		PessoaPerfil other = (PessoaPerfil) obj;
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
