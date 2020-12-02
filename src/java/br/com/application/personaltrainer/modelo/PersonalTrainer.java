package br.com.application.personaltrainer.modelo;


public class PersonalTrainer {
    private int id;
    private String cref;
    private String nome;
    private String email;
    private String senha;
    private double precoPorHora;
    private int experiencia;
    private String dataAula;

    public PersonalTrainer() {
    }

    public int getId() {
        return id;
    }

    public String getCref() {
        return cref;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getDataAula() {
        return dataAula;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setDataAula(String dataAula) {
        this.dataAula = dataAula;
    }
    
    
}
