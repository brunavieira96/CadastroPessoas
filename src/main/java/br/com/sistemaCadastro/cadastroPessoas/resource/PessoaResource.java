package br.com.sistemaCadastro.cadastroPessoas.resource;

import br.com.sistemaCadastro.cadastroPessoas.model.Pessoa;
import br.com.sistemaCadastro.cadastroPessoas.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaResource {

    private PessoaService pessoaService;

    @Autowired
    public PessoaResource(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas() {
        List<Pessoa> pessoas = pessoaService.getAll();
        if (pessoas == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pessoas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pessoa>> getById(@PathVariable int id) {
        Optional<Pessoa> pessoa = pessoaService.getById(id);
        if (pessoa == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pessoa);

    }

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        Pessoa newPessoa = pessoaService.savePessoa(pessoa);
        if (newPessoa == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(newPessoa);
    }

    @PutMapping
    public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoa) {
        Pessoa newPessoa = pessoaService.update(pessoa);
        if (newPessoa == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(newPessoa);

    }

    @DeleteMapping("/{/id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        pessoaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
