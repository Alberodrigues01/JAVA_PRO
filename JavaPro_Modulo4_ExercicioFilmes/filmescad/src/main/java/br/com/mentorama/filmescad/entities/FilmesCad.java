package br.com.mentorama.filmescad.entities;

public class FilmesCad {

    private Integer id;
    private String nomeFilme;
    private String nomeDiretor;
    private String ano;
    private Integer nota;

    public FilmesCad(Integer id, String nomeFilme, String nomeDiretor, String ano, Integer nota) {
        this.id = id;
        this.nomeFilme = nomeFilme;
        this.nomeDiretor = nomeDiretor;
        this.ano = ano;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}


