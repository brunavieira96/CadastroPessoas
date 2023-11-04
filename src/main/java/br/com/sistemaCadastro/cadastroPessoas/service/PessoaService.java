package br.com.sistemaCadastro.cadastroPessoas.service;

import br.com.sistemaCadastro.cadastroPessoas.entity.Pessoa;
import br.com.sistemaCadastro.cadastroPessoas.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa savePessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public List<Pessoa> savePessoa(List<Pessoa> pessoa) {
        return repository.saveAll(pessoa);

    }

    public Optional<Pessoa> getPessoaById(int id) {
        return repository.findById(id);
    }

    public List<Pessoa> getAll() {
        return repository.findAll();
    }

    public Pessoa update(Pessoa pessoa) {
        Optional<Pessoa>upPessoa = repository.findById(pessoa.getId());

        if(upPessoa.isPresent()) {

            Pessoa newPessoa = upPessoa.get();
            newPessoa.setNome(pessoa.getNome());
            newPessoa.setEndereco(pessoa.getEndereco());
            newPessoa.setCep(pessoa.getCep());
            newPessoa.setCidade(pessoa.getCidade());
            newPessoa.setUf(pessoa.getUf());
            return repository.save(newPessoa);

        }
        return pessoa;
    }

    public void delete(int id) {
       repository.deleteById(id);
    }

}
