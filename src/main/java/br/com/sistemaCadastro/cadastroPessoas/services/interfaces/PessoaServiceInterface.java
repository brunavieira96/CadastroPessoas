package br.com.sistemaCadastro.cadastroPessoas.services.interfaces;

import br.com.sistemaCadastro.cadastroPessoas.model.Pessoa;

import java.util.List;
import java.util.Optional;

public interface PessoaServiceInterface {

    Pessoa savePessoa(Pessoa pessoa);
    Optional<Pessoa> getById(int id);
    List<Pessoa> getAll();
    Pessoa update(Pessoa pessoa);
    void delete(int id);


}
