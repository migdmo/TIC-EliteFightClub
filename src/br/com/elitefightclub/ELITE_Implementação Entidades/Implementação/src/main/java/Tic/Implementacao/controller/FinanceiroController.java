package Tic.Implementacao.controller;

import Tic.Implementacao.model.Financeiro;
import Tic.Implementacao.service.FinanceiroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping

public class FinanceiroController {


    private FinanceiroService service;

    public FinanceiroController(FinanceiroService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Financeiro>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Financeiro>> buscarPorId(@PathVariable Long id) {

        Optional<Financeiro> financeiro = service.buscarPorId(id);

        if (financeiro.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(financeiro);
    }


    @PostMapping
    public ResponseEntity<Financeiro> salva(@RequestBody Financeiro financeiro){
        Financeiro camp = service.salva(financeiro);
        if(financeiro !=null){
            URI uri = URI.create("/financeiro"+ financeiro.getId());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id){
        if(service.remove(id)){
            ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Financeiro> atualizaInformacoes(@PathVariable Long id, @RequestBody Financeiro alterado){
        Financeiro resposta = service.atualizarInformacoes(id, alterado);
        if(resposta != null){
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();
    }
}
