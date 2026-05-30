package Tic.Implementacao.service;

import Tic.Implementacao.model.Aluno;
import Tic.Implementacao.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import Tic.Implementacao.model.Aluno;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private AlunoRepository repo;

    public AlunoService(AlunoRepository repo){
        this.repo = repo;
    }

    /*
    @Override
    public void cadastrar() {}
    @Override
    public void atualizarDados() {}
    @Override
    public String exibirIdentificacao() { return ""; }
     */

    public List<Aluno> cadastrar(){
        return repo.findAll();
    }


    public Optional<Aluno> exibirIdentificacao(Long id){
        return repo.findById(id);
    }

    public boolean remove(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public Aluno atualizarDados(Long id, Aluno alterado){
        if (repo.existsById(id)){

            alterado.setId(id);
            return repo.save(alterado);
        }
        return  null;
    }


    public Aluno salva(Aluno aluno ){
        return repo.save(aluno);
    }









}
