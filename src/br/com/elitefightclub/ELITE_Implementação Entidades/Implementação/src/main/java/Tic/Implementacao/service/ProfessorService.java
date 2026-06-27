package Tic.Implementacao.service;

import Tic.Implementacao.model.Professor;
import Tic.Implementacao.repository.ProfessorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private ProfessorRepository repo;

    public ProfessorService(ProfessorRepository repo) {
        this.repo = repo;
    }

    public List<Professor> listar(){
        return repo.findAll();
    }

    public Optional<Professor> exibirIdentificacao(Long id){
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
    public Professor atualizarDados(Long id, Professor alterado){
        if (repo.existsById(id)){
            alterado.setId(id);
            return repo.save(alterado);
        }
        return null;
    }

    @Transactional
    public Professor salva(Professor professor){
        return repo.save(professor);
    }
}