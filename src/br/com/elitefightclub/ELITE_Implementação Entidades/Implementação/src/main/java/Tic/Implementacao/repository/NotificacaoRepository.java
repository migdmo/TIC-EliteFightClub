package Tic.Implementacao.repository;

import Tic.Implementacao.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {

//    Notificacao save(Notificacao notificacao);
//
//    boolean existsById(Long id);
//
//    void deleteById(Long id);
//
//    List<Notificacao> findAll();
//
//    Optional<Notificacao> findById(Long id);
}