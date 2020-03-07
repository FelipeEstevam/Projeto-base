package com.stefanini.dao;

import java.util.ArrayList;
import java.util.List;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.dto.FiltroPessoa;
import com.stefanini.model.Pessoa;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class PessoaDao extends GenericDao<Pessoa, Long> {

	public PessoaDao() {
		super(Pessoa.class);
	}
	
	public List<Pessoa> getList(FiltroPessoa filtro) {
	    //Retornar uma Lista de Pessoa com base no filtro
	    return new ArrayList<Pessoa>();
	}
}
