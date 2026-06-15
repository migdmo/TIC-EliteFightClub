package Tic.Implementacao.service;

import Tic.Implementacao.model.Financeiro;
import Tic.Implementacao.repository.FinanceiroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinanceiroService {

    private final FinanceiroRepository repository;

    public FinanceiroService(FinanceiroRepository repository) {
        this.repository = repository;
    }
    public List<Financeiro> listarTodos(){return repository.findAll();}

    public Optional<Financeiro> buscarPorId(Long id){return repository.findById(id);}
}
