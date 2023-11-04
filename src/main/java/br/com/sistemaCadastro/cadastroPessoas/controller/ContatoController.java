package br.com.sistemaCadastro.cadastroPessoas.controller;


import br.com.sistemaCadastro.cadastroPessoas.entity.Contato;
import br.com.sistemaCadastro.cadastroPessoas.entity.Pessoa;
import br.com.sistemaCadastro.cadastroPessoas.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatoController {

    @Autowired
    private ContatoService service;

    @PostMapping("addContato")
    public Contato addContato(@RequestBody Contato contato) {
        return service.saveContato(contato);
    }
    @PostMapping("/addContatos")
    public List<Contato> addContatos(@RequestBody List<Contato> contatos) {
        return service.saveContato(contatos);
    }

    @GetMapping("/contatos")
    public List<Contato> findAllContatos(){

        return service.getAll();
    }

    @GetMapping("/contato/{id}")
    public Optional<Contato> findContatoById(@PathVariable int id) {
        return service.getContatoById(id);
    }

    @PutMapping("/updateContatos")
    public Contato atualizarContato(@RequestBody Contato contato) {
        return service.update(contato);
    }

    @DeleteMapping("/deleteContato/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }


}
