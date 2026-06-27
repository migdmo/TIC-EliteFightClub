package Tic.Implementacao.service;

import Tic.Implementacao.model.Notificacao;
import Tic.Implementacao.repository.NotificacaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacaoService {

    private final NotificacaoRepository repo;

    public NotificacaoService(NotificacaoRepository repo){
        this.repo = repo;
    }

    public List<Notificacao> listarTodos(){
        return repo.findAll();
    }

    public Optional<Notificacao> buscarPorId(Long id){
        return repo.findById(id);
    }

    @Transactional
    public boolean remove(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    @Transactional
    public Notificacao salva(Notificacao notificacao){
        return repo.save(notificacao);
    }

    @Transactional
    public Notificacao atualizarInformacoes(Long id, Notificacao alterado) {
        return alterado;
    }
}