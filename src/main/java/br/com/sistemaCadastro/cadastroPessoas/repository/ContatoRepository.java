package br.com.sistemaCadastro.cadastroPessoas.repository;

import br.com.sistemaCadastro.cadastroPessoas.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository <Contato, Integer>{


}
