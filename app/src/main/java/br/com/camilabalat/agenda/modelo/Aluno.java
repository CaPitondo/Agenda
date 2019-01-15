package br.com.camilabalat.agenda.modelo;

public class Aluno {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String site;
    private Double nota;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSite() {
        return site;
    }

    public Double getNota() {
        return nota;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString()  {
        return getId() + " - " + getNome();
    }
}
