package br.com.mentorama.filmescad.repository;

import br.com.mentorama.filmescad.entities.FilmesCad;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class FilmesCadRepository {

    private List <FilmesCad> filmes;

    public FilmesCadRepository (){
        this.filmes = new ArrayList<>();

        FilmesCad filme1 = new FilmesCad(1, "Duuna", "Denny V.",
                          "2020", 5 );

        filmes.add(filme1);
    }

    //1)Listar todos:
    public List<FilmesCad> findAll(){
        return filmes;
    }

    //2) Buscar por id:
    public FilmesCad findById(Integer id) {
        return filmes.stream()
                .filter(fcad -> fcad.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    //3) Buscar por nomeFilme:
    public FilmesCad findByNameMovie(String nomeFilme){
        return filmes.stream()
                .filter(fcad -> fcad.getNomeFilme().contains(nomeFilme))
                .findFirst()
                .orElse(null);
    }

    //4) Cadastrar um novo filme:
    public void post(FilmesCad filmesCad){
        this.filmes.add(filmesCad);
    }
    public Integer count(){
        return filmes.size();
    }

}
