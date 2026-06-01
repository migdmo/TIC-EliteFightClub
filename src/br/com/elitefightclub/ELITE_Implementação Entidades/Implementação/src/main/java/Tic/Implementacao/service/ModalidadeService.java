package Tic.Implementacao.service;

import Tic.Implementacao.model.Modalidade;
import Tic.Implementacao.repository.ModalidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModalidadeService {

    private final ModalidadeRepository repository;

    public ModalidadeService(ModalidadeRepository repository) {
        this.repository = repository;
    }

    public List<Modalidade> listarTodas() {
        return repository.findAll();
    }

    public List<Modalidade> listarAtivas() {
        return repository.findByAtivaTrue();
    }

    public Optional<Modalidade> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Modalidade salvar(Modalidade modalidade) {
        return repository.save(modalidade);
    }

    public Modalidade atualizar(Long id, Modalidade dadosNovos) {
        Modalidade modalidade = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Modalidade não encontrada com ID: " + id));
        modalidade.setNome(dadosNovos.getNome());
        modalidade.setDescricao(dadosNovos.getDescricao());
        modalidade.setAtiva(dadosNovos.isAtiva());
        return repository.save(modalidade);
    }

    public boolean remover(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
