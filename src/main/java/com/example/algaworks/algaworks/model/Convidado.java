package com.example.algaworks.algaworks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;
@Entity
public class Convidado implements Serializable {
 @Serial
 private static final long serialVersionUID=1L;
     @Id
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Id
    @GeneratedValue
   private Long Id;
 private  String nome;
  private  Integer quantidade;





}
