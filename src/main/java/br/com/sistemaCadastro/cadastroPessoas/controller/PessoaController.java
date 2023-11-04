package br.com.sistemaCadastro.cadastroPessoas.controller;


import br.com.sistemaCadastro.cadastroPessoas.entity.Pessoa;
import br.com.sistemaCadastro.cadastroPessoas.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping("/addPessoa")
    public Pessoa addPessoa(@RequestBody Pessoa pessoa) {
        return service.savePessoa(pessoa);
    }

    @PostMapping("/addPessoas")
    public List<Pessoa> addPessoas(@RequestBody List<Pessoa> pessoas) {
        return service.savePessoa(pessoas);
    }

    @GetMapping("/pessoas")
    public List<Pessoa> findAllPessoas(){

        return service.getAll();
    }

    @GetMapping("/produto/{id}")
    public Optional<Pessoa> findPessoaById(@PathVariable int id) {
        return service.getPessoaById(id);
    }

    @PutMapping("/update")
    public Pessoa atualizarPessoa(@RequestBody Pessoa pessoa) {
        return service.update(pessoa);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
