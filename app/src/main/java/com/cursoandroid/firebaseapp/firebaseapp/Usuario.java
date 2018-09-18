package com.cursoandroid.firebaseapp.firebaseapp;

/**
 * Created by 001733 on 24/02/2017.
 */
public class Usuario {

    private String nome;
    private String sobrenome;
    private String sexo;
    private int idade;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
