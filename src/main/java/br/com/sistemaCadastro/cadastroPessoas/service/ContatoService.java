package br.com.sistemaCadastro.cadastroPessoas.service;


import br.com.sistemaCadastro.cadastroPessoas.entity.Contato;
import br.com.sistemaCadastro.cadastroPessoas.entity.Pessoa;
import br.com.sistemaCadastro.cadastroPessoas.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    private ContatoRepository repository;

    public Contato saveContato(Contato contato) {
        return repository.save(contato);
    }

    public List<Contato> saveContato(List<Contato> contato) {
        return repository.saveAll(contato);

    }

    public List<Contato> getContato() {
        return repository.findAll();
    }

    public Optional<Contato> getContatoById(int id) {
        return repository.findById(id);
    }

    public List<Contato> getAll() {
        return repository.findAll();
    }

    public Contato update(Contato contato) {
        Optional<Contato> upContato = repository.findById(contato.getId());

        if (upContato.isPresent()) {

            Contato newContato = upContato.get();
            newContato.setTipoContato(contato.getTipoContato());
            newContato.setContato(contato.getContato());
            return repository.save(newContato);

        }

        return contato;
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

}
