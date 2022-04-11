package br.com.mentorama.filmescad.controller;

import br.com.mentorama.filmescad.entities.FilmesCad;
import br.com.mentorama.filmescad.services.FilmesCadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmesCadController {

    @Autowired
    private FilmesCadService filmesCadService;



    //1) Listar todos:
    @GetMapping
    public ResponseEntity <List<FilmesCad>> findAll(){
        return new ResponseEntity<>(filmesCadService.findAll(), HttpStatus.OK);
    }

    //2) Buscar por id:
    @GetMapping("/{id}")
    public FilmesCad findById(@PathVariable ("id") Integer id){
        return filmesCadService.findById(id);
    }

    //3) Buscar por nomeFilme:
    @GetMapping("/{nomeFilme}")
    public FilmesCad findByNameMovie(@PathVariable ("nomeFime") String nomeFilme){
        return filmesCadService.findByNameMovie(nomeFilme);
    }

    //4) Cadastrar um novo filme:
    @PostMapping
    public ResponseEntity<Integer> post(@RequestBody FilmesCad filmesCad) {
        Integer id = filmesCadService.post(filmesCad);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}
