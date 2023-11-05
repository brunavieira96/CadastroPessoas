package br.com.sistemaCadastro.cadastroPessoas.repository;

import br.com.sistemaCadastro.cadastroPessoas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Integer> {

}
