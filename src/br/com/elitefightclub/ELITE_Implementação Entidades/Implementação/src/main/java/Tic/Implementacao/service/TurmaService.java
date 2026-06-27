package Tic.Implementacao.service;

import Tic.Implementacao.model.Turma;
import Tic.Implementacao.repository.TurmaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    private TurmaRepository repo;

    public TurmaService(TurmaRepository repo){
        this.repo = repo;
    }

    public List<Turma> listar(){
        return repo.findAll();
    }

    public Optional<Turma> buscarPorId(Long id){
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
    public Turma atualizarDados(Long id, Turma alterado){
        if(repo.existsById(id)){
            alterado.setId(id);
            return repo.save(alterado);
        }
        return null;
    }

    @Transactional
    public Turma salva(Turma turma){
        return repo.save(turma);
    }
}