package br.com.sistemaCadastro.cadastroPessoas.repository;

import br.com.sistemaCadastro.cadastroPessoas.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {


}
