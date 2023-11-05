package br.com.sistemaCadastro.cadastroPessoas.service;

import br.com.sistemaCadastro.cadastroPessoas.repository.ContatoRepository;
import br.com.sistemaCadastro.cadastroPessoas.service.interfaces.ContatoServiceInterface;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
@ComponentScan("br.com.sistemaCadastro.cadastroPessoas.resource")
@Service
public interface ContatoService extends ContatoServiceInterface {


}
