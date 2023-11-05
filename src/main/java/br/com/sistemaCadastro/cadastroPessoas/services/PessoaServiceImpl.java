package br.com.sistemaCadastro.cadastroPessoas.services;

import br.com.sistemaCadastro.cadastroPessoas.model.Pessoa;
import br.com.sistemaCadastro.cadastroPessoas.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PessoaServiceImpl implements PessoaService {
    private PessoaRepository pessoaRepository;

    @Autowired
    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    @Override
    public Pessoa savePessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Optional<Pessoa> getById(int id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public List<Pessoa> getAll() {

        return pessoaRepository.findAll();
    }


    @Override
    public Pessoa update(Pessoa pessoa) {
        Optional<Pessoa> upPessoa = pessoaRepository.findById(pessoa.getId());

        if(upPessoa.isPresent()) {
            Pessoa newPessoa = upPessoa.get();
            newPessoa.setNome(pessoa.getNome());
            newPessoa.setEndereco(pessoa.getEndereco());
            newPessoa.setCep(pessoa.getCep());
            newPessoa.setCidade(pessoa.getCidade());
            newPessoa.setUf(pessoa.getUf());
            return pessoaRepository.save(newPessoa);
        }

        return pessoa;
    }

    @Override
    public void delete(int id) {
        pessoaRepository.deleteById(id);
    }
}
