package Tic.Implementacao.controller;


import Tic.Implementacao.model.Aluno;
import Tic.Implementacao.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Aluno")
public class AlunoController {

    private AlunoService service;
    public AlunoController(AlunoService service){
        this.service = service;
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Aluno>> cadastrar(){
        return ResponseEntity.ok(service.cadastrar());
    }

    //GET ID

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Aluno>> exibirIdentificacao(@PathVariable Long id){
        Optional<Aluno> alu = service.exibirIdentificacao(id);
        if(alu.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(alu);
    }

    @PostMapping
    public ResponseEntity<Aluno> salva(@RequestBody Aluno aluno){
        Aluno novo = service.salva(aluno);
        if(novo != null){
            //URI
            URI uri = URI.create("/aluno" + novo.getId());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id){
        if(service.remove(id)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Aluno> atualizarDados(@PathVariable Long id, @RequestBody Aluno alterado){
        Aluno resposta = service.atualizarDados(id, alterado);
        if(resposta != null){
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();

    }






    

}
