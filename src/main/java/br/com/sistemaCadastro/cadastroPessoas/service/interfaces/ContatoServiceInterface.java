package br.com.sistemaCadastro.cadastroPessoas.service.interfaces;

import br.com.sistemaCadastro.cadastroPessoas.model.Contato;

import java.util.List;
import java.util.Optional;

public interface ContatoServiceInterface {

    Contato save(Contato contato);
    Optional<Contato> getById(int id);
    List<Contato> getAll();
    Contato update(Contato contato);

    void delete(int id);

}
