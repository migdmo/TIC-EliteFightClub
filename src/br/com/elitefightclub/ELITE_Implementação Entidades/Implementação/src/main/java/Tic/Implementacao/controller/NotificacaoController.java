package Tic.Implementacao.controller;
import Tic.Implementacao.model.Financeiro;
import Tic.Implementacao.model.Notificacao;
import Tic.Implementacao.service.NotificacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    private NotificacaoService service;

    public NotificacaoController(NotificacaoService service){
        this.service = service;

    }

    @GetMapping
    public ResponseEntity<List<Notificacao>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Notificacao>> buscarPorId(@PathVariable Long id) {

        Optional<Notificacao> notificacao = service.buscarPorId(id);

        if (notificacao.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(notificacao);
    }


    @PostMapping
    public ResponseEntity<Notificacao> salva(@RequestBody Notificacao notificacao){
        Notificacao camp = service.salva(notificacao);
        if(notificacao !=null){
            URI uri = URI.create("/notificação"+ notificacao.getId());
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
    public ResponseEntity<Notificacao> atualizaInformacoes(@PathVariable Long id, @RequestBody Notificacao alterado){
        Notificacao resposta = service.atualizarInformacoes(id, alterado);
        if(resposta != null){
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();
    }


}
