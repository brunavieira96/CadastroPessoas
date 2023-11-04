package br.com.sistemaCadastro.cadastroPessoas.repository;

import br.com.sistemaCadastro.cadastroPessoas.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {


}
