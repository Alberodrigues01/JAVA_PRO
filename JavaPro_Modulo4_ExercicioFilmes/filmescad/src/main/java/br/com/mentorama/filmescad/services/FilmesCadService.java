package br.com.mentorama.filmescad.services;

import br.com.mentorama.filmescad.entities.FilmesCad;
import br.com.mentorama.filmescad.repository.FilmesCadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesCadService {

    @Autowired
    private FilmesCadRepository filmesCadRepository;

     //1) Listar todos:
    public List<FilmesCad> findAll() {
        return filmesCadRepository.findAll();
    }

    //2) Buscar por id:
    public FilmesCad findById(Integer id) {
        return filmesCadRepository.findById(id);
    }

    //3) Buscar por nomeFilme:
    public FilmesCad findByNameMovie(String nomeFilme) {
        return filmesCadRepository.findByNameMovie(nomeFilme);
    }

    //4) Cadastrar um novo filme:
    public Integer post(FilmesCad filmesCad) {
        if (filmesCad.getId() == null) {
            filmesCad.setId(filmesCadRepository.count() + 1);
        }

        filmesCadRepository.post(filmesCad);
        return filmesCad.getId();
        }
}



