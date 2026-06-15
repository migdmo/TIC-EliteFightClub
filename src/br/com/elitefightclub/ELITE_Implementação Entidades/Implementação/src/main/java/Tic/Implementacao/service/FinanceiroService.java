package Tic.Implementacao.service;

import Tic.Implementacao.model.Financeiro;
import Tic.Implementacao.repository.FinanceiroRepository;
import org.springframework.stereotype.Service;
import Tic.Implementacao.model.Aluno;
import java.util.List;
import java.util.Optional;


@Service
public class FinanceiroService {

    private final FinanceiroRepository repository;

    public FinanceiroService(FinanceiroRepository repository) {
        this.repository = repository;
    }


    /* @Override
    public void registrarPagamento(){}  => Optional
    @Override
    public void aplicarDesconto(float desconto){ => Optional
        this.desconto = desconto;
    }
    @Override
    public float calcularMensalidadeAtual(){ => Optional
        return valor - desconto;
    }
    */


    public void registrarPagamento(){

    }


    public List<Financeiro> listarTodos(){
        return repository.findAll();
    }

    public Optional<Financeiro> buscarPorId(Long id){
        return repository.findById(id);
    }



    public boolean remove(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }



    public Financeiro atualizarInformacoes(Long id, Financeiro alterado){
        if(repository.existsById(id)){
            alterado.setId(id);
            return repository.save(alterado);
        }
        return null;
    }

    public Financeiro salva(Financeiro financeiro){
        return repository.save(financeiro);
    }







}
