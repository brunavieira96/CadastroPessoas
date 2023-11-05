package br.com.sistemaCadastro.cadastroPessoas.service;

import br.com.sistemaCadastro.cadastroPessoas.model.Contato;
import br.com.sistemaCadastro.cadastroPessoas.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ContatoServiceImpl implements ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public ContatoServiceImpl(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }
    @Override
    public Contato save(Contato contato) {
        return contatoRepository.save(contato);
    }

    @Override
    public Optional<Contato> getById(int id) {
        return contatoRepository.findById(id);
    }

    @Override
    public List<Contato> getAll() {
        return contatoRepository.findAll();
    }

    @Override
    public Contato update(Contato contato) {
        Optional<Contato> upContato = contatoRepository.findById(contato.getId());
        if(upContato.isPresent()) {
            Contato newContato =upContato.get();
            newContato.setTipoContato(contato.getTipoContato());
            newContato.setContato(contato.getContato());
            newContato.setIdPessoa(contato.getIdPessoa());
            return contatoRepository.save(newContato);


        }

        return contato;
    }

    @Override
    public void delete(int id) {
        contatoRepository.deleteById(id);
    }
}
