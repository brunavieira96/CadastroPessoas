package br.com.sistemaCadastro.cadastroPessoas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pessoas")
public class Pessoa {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String endereco;
    private String cep;
    private String cidade;
    private String uf;

}
