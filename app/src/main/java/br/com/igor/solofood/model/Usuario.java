package br.com.igor.solofood.model;

/**
 * Created by igor on 11/03/2018.
 */

public class Usuario {

    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Usuario(String nome, String telefone, String email, String senha){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
